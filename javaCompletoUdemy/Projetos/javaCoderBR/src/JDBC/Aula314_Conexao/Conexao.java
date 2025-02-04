package JDBC.Aula314_Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/JavaCod3rBr?verifyServerCertificate=false&useSSL=true";
            String usuario = "root";
            String senha = "Lucas@120905";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
