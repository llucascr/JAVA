package OrientadoObjetos.Interface.Aula172_Interface02;

public interface Luxo {

    void ligarAr();
    void desligarAr();

    // Por padrao o metodo nao precisa ser implementado mas ele vai retornar 1 se for chamado
    default int velocidadeDoAr() {
        return 1;
    }
}
