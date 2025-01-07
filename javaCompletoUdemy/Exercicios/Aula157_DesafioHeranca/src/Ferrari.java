public class Ferrari extends Carro{

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15; // Modifica a aceleração da classe Carro
    }

//    @Override
//    void acelerar() {
//        velocidadeAtual += 15;
//    }
}
