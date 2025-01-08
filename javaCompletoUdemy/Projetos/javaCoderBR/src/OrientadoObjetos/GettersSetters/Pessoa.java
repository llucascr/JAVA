package OrientadoObjetos.GettersSetters;

public class Pessoa {

    private String nome;
    private int idade;
    private String sobrenome;

    public Pessoa( String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

//    // Setters
//    public void setIdade(int idade) {
//        if (idade >= 0 && idade <= 120) {
//            this.idade = idade;
//        }else {
//            System.out.println("Idade invalida");
//        }
//    }
//
//    // Getters
//    public int getIdade() {
//        return idade;
//    }

    // Gerado pelo InteliJ
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Getter que gera nome completo
    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos";
    }
}
