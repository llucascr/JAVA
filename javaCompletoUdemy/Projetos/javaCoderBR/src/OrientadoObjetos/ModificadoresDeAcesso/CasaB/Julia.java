package OrientadoObjetos.ModificadoresDeAcesso.CasaB;

import OrientadoObjetos.ModificadoresDeAcesso.CasaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos() {
//        System.out.println(esposa.segredo); // ERRO
//        System.out.println(sogra.facoDentroDeCasa); // ERRO não está no mesmo pacote
//        System.out.println(sogra.formaDeFalar); // ERRO não está sendo herdado
        System.out.println(sogra.todosSabem);
    }
}
