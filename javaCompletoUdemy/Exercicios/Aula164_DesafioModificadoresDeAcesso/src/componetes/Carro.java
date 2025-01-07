package componetes;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual = 0;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += delta;
        }
    }

    public void freiar() {
        if (velocidadeAtual >= delta ) {
            velocidadeAtual -= delta;
        }else {
            velocidadeAtual = 0;
        }
    }

    public int mostrarVelocidade() {
        return this.velocidadeAtual;
    }
}
