package componetes;

public class Ferrari extends Carro {

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15; // Modifica a aceleração da classe componetes.Carro
    }

//    @Override
//    public void acelerar() {
//        velocidadeAtual += 15;
//    }
}
