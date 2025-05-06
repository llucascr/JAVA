package Aula02_TrabalhandoComRecords;

public record Pessoa(String nome, int idade) { // t odo atributo declarado no record é privado
    // Usamos record para trabalhar somente com objetos imutaveis

    public Pessoa { // Roda apos o objeto ser instanciado com o construtor
        System.out.println("===========");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("===========");
    } // pode usar esse contrutor do record para fazer validação de dados

    public Pessoa(String nome) {
        this(nome, 1); // idade iniciada como default 1
    }
}
