package TratamentoDeErros.ExcecaoPersonalizada;

public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atrtributo '%s' esta vazio", nomeDoAtributo);
    }
}
