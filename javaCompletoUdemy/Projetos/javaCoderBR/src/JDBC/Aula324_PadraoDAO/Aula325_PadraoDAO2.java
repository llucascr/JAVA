package JDBC.Aula324_PadraoDAO;

public class Aula325_PadraoDAO2 {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO PESSOA (nome) VALUES (?)";

        dao.incluir(sql, "Joao"); // Retorna os Ids
        dao.incluir(sql, "Paulo");
        dao.incluir(sql, "Ricardo");

        dao.close();
    }
}
