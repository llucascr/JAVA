import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo: ");
        int codigo =  scanner.nextInt();
        scanner.nextLine();

        Connection connection = Conexao.getConnection();

        String select = "SELECT codigo, nome FROM PESSOA WHERE codigo = ?";
        String update = "UPDATE PESSOA SET nome = ? WHERE codigo = ? ";

        PreparedStatement stmt = connection.prepareStatement(select);
        stmt.setInt(1, codigo);

        ResultSet r = stmt.executeQuery();

        if(r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

            System.out.println("Nome atual: " + p.getNome());

            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();

            stmt.close(); // fecha e abre novamente
            stmt = connection.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);

            stmt.execute();

            System.out.println("Pessoa alterada!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        scanner.close();
        connection.close();
    }
}
