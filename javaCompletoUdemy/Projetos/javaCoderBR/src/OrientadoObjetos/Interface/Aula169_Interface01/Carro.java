package OrientadoObjetos.Interface.Aula169_Interface01;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual = 0;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += getDelta(); // Usar o getDelta() para a implementacao de ferrari funcionar
        }
    }

    void freiar() {
        if (velocidadeAtual >= delta ) {
            velocidadeAtual -= delta;
        }else {
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
