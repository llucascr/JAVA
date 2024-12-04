package Fundamentos;

public class Aula24_InferenciaTipos {
    public static void main(String[] args) {
        // O java vai inferir, pelo valor que você colocou, o tipo da variavel
        var b = 4.5; // double/flout
//        b = 1 // ERRO tipo diferente

        var c = "Texto"; // String

        var i = 10; // int

//        var e;
//        e = 34; // ERRO de não incialização de tipo
    }
}
