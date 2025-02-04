package JDBC.Aula316_InserirRegistro;

import JDBC.Aula314_Conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Aula316_InserirRegistro {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        String sql = "INSERT INTO PESSOA (nome) VALUES (?)";
        System.out.println(sql);

        Connection connection = Conexao.getConnection();

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();
        System.out.println("INSERT Realizado com sucesso!");

        connection.close();
        scanner.close();
    }
}
