package OrientadoObjetos.Composicao.Aula143_RelacionamentoUm_Pra_Um;

public class Carro {

    Motor motor = new Motor();

    // Bidirecional
//    final Motor motor;
//
//    Carro() {
//        this.motor = new Motor(this);
//    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaligado() {
        return motor.ligado;
    }
}
