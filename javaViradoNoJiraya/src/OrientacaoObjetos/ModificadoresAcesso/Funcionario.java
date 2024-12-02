package OrientacaoObjetos.ModificadoresAcesso;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            System.out.println("Salarios não encontrados!");
            return;
        }
        for(double salario : salarios){
            System.out.print(salario + " ");
        }
        System.out.println("\n-------------------------");
        System.out.println("Media: " + this.media);
    }

    public void mediaSalarios(double[] salarios){
        if (salarios == null) return;

        for(double salario : salarios){
            this.media += salario;
        }
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        mediaSalarios(salarios);
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getters

    public double[] getSalarios() {
        return salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }
}
