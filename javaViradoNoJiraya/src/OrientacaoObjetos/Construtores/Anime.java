package OrientacaoObjetos.Construtores;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    // 1 Metodo que faz a inicialização de todos os atributos

    //Construtor
    // modificador_de_acesso Nome_da_Classe(){}
    public Anime(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        // Podemos fazer sobrecarga de Construtores
        System.out.println("Dentro do Construtor sem argumentos");
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        this(nome, tipo, episodios, genero);
        this.studio = studio;
    }

    public void imprimir() {
        System.out.println("Tipos: " + this.tipo);
        System.out.println("Ep: " + this.episodios);
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Studio: " + this.studio);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
