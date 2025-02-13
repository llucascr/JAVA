package Relacionamentos.UmParaUm.Aula349_UmParaUm;

import DAO.DAO;
import Relacionamentos.UmParaUm.Aula348_UmParaUm.Assento;
import Relacionamentos.UmParaUm.Aula348_UmParaUm.Cliente;

public class Aula349_UmParaUm {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Ricardo", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirCompleto(cliente); // precisa implementar o @OneToOne(cascade = CascadeType.PERSIST)
    }
}
