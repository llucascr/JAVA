package OrientadoObjetos.Interface.Aula169_Interface01;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15); // Modifica a aceleração da classe Carro
    }

//    @Override // Não é necessario
//    void acelerar() {
//        velocidadeAtual += 15;
//    }

    // Interfaces de Esportivo
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    // Interfaces de Luxo
    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    // Soreescrevendo o metodo getDelta
    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        }else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
