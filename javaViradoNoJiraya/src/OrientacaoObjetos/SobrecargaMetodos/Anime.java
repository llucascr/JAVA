package OrientacaoObjetos.SobrecargaMetodos;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // 1 Metodo que faz a inicialização de todos os atributos
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Sobrecarga de metodos = Metodos com mesmo nome porem a quantidade e tipos do parametros diferentes
//    public void init2(String nome, String tipo, int episodios, String genero) {
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//        this.genero = genero;
//    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
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
}
