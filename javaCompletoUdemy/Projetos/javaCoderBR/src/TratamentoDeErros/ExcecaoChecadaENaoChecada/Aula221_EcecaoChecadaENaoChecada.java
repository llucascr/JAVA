package TratamentoDeErros.ExcecaoChecadaENaoChecada;

public class Aula221_EcecaoChecadaENaoChecada {
    public static void main(String[] args) {
//        geraErro1(); // NÃO ha obrigatoriedade de tratar o ERRO
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2(); // Obrigatoriedade de tratar o ERRO
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("FIM!");
    }

    // Excecço NÃO checada ou não verificada
    static void geraErro1() {
        // throw : Lançar um erro
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
        // ERROR: System.out.println(); // não pode ter nada depois
    }

    // Exceção checada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
}
