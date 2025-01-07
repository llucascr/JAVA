package OrientadoObjetos.ModificadoresDeAcesso.CasaB;

import OrientadoObjetos.ModificadoresDeAcesso.CasaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();

    void testeAcessos() {
//        System.out.println(esposa.segredo); // ERRO
//        System.out.println(mae.facoDentroDeCasa); // ERRO deria que estar dentro do mesmo pacote
        System.out.println(formaDeFalar); // ERRO mae.formaDeFalar ele herda diretamente de Ana e não de uma instancia sua
        System.out.println(mae.todosSabem);
    }
}
