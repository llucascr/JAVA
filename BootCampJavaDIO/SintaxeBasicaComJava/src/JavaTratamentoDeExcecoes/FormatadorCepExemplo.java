package JavaTratamentoDeExcecoes;

public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            System.out.println(formatarCep("23765064")); // Exige que tratamos o erros com try cath
        } catch (CepInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        // simulando um cep formatado
        return "23.765-064";
    }
}
