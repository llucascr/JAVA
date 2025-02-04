package JDBC.Aula322_ExcluirRegistro;

import JDBC.Aula314_Conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Aula322_ExcluirRegistro {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();

        Connection connection = Conexao.getConnection();

        String sql = "DELETE FROM PESSOA WHERE codigo = ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("DELETE executado com sucesso!");
        } else {
            System.out.println("codigo não existe!");
        }

        scanner.close();
        connection.close();
    }
}
