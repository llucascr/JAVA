package OrientadoObjetos.ModificadoresDeAcesso.CasaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
//        System.out.println(esposa.segredo); // ERRO
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);

    }
}
