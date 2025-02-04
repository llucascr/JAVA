package JDBC.Aula317_ConsultarRegistros;

import JDBC.Aula314_Conexao.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Aula317_ConsultarRegistros {

    public static void main(String[] args) throws SQLException {

        Connection connection = Conexao.getConnection();

        String sql = "SELECT * FROM PESSOA";

        Statement stmt = connection.createStatement();

        ResultSet result = stmt.executeQuery(sql);

        // Opcional
        List<Pessoa> pessoas = new ArrayList<>();

        while (result.next()) {
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        System.out.println("codigo\tnome");
        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " : " + p.getNome());
        }

        connection.close();
    }
}
