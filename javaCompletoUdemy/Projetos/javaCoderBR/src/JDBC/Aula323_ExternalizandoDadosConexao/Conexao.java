package JDBC.Aula323_ExternalizandoDadosConexao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

    public static Connection getConnection() {
        try {
            Properties prop = getProperties();
            String url = prop.getProperty("banco.url");
            String usuario = prop.getProperty("banco.usuario");
            String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String caminho = "JDBC/Aula323_ExternalizandoDadosConexao/conexao.properties";
        try (InputStream in = new FileInputStream(caminho)) {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        prop.load(Conexao.class.getResourceAsStream(caminho));
        return prop; // Conexao via properties nao esta funcionando!!!!!!!!!
    }
}
