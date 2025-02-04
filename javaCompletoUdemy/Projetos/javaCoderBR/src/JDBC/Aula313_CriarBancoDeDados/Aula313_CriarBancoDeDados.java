package JDBC.Aula313_CriarBancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula313_CriarBancoDeDados {
    public static void main(String[] args) throws SQLException{

        String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "Lucas@120905";

        Connection connection = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = connection.createStatement();
//        stmt.execute("CREATE DATABASE curso_java");
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");

        connection.close();
    }
}
