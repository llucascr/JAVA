package JDBC.Aula312_abrindoConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aula312_abrindoConexao {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/JavaCod3rBr?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "Lucas@120905";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();
    }
}
