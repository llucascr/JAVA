package JDBC.Aula324_PadraoDAO;

import JDBC.Aula314_Conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection connection;

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);

            if (stmt.executeUpdate() > 0) {
                ResultSet result = stmt.getGeneratedKeys(); // gera chaves automaticamente

                if (result.next()) {
                    return result.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection = null;
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {

        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                stmt.setInt(indice, (Integer) atributo);
            } // Double, Boolean
            indice++;
        }
    }

    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection; // Se a conexao ja estiver aberta ele retorna ela sem precisar criar uma nova
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        connection = Conexao.getConnection();
        return connection;
    }
}
