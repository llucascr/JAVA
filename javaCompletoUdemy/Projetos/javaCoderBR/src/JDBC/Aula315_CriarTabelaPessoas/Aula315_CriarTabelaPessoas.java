package JDBC.Aula315_CriarTabelaPessoas;

import JDBC.Aula314_Conexao.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula315_CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection connection = Conexao.getConnection();

        String sql = """
                CREATE TABLE IF NOT EXISTS PESSOA (
                    codigo INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(80) NOT NULL
                );
                """;

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela Criada com sucesso!");
        connection.close();
    }
}
