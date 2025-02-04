package JDBC.Aula314_Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula314_CriarBancoDeDados {
    public static void main(String[] args) throws SQLException{
        Connection connection = Conexao.getConnection();

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");

        connection.close();
    }
}
