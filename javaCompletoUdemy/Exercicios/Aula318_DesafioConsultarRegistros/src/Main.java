import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a/as letras: ");
        String letras = scanner.nextLine();

        Connection connection = Conexao.getConnection();

        String sql = "SELECT * FROM PESSOA WHERE nome LIKE ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "%" + letras + "%");

        ResultSet result = stmt.executeQuery();

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

        scanner.close();
        connection.close();
    }
}
