public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += delta;
        }
    }

    void freiar() {
        if (velocidadeAtual >= delta ) {
            velocidadeAtual -= delta;
        }else {
            velocidadeAtual = 0;
        }
    }
}
