package OrientacaoObjetos.ModificadoresAcesso;

public class Pessoa {
    private String nome;
    private int idade;

//    public void imprime(){
//        System.out.println("Nome: " + this.nome);
//        System.out.println("Idade: " + this.idade);
//    }

    // Cria um metodo publico para acessar o atributo privado
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade Invalida!");
            return;
        }
        this.idade = idade;
    }
    // Baixo acoplamento = bom | Alta Coesao = bom

    // Getters
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}