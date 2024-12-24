package OrientadoObjetos.Composicao.Aula143_RelacionamentoUm_Pra_Um;

public class Aula143_RelacionamentoUm_Pra_Um {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("Ligado: " + c1.estaligado());

        c1.ligar(); // ligou o motor

        System.out.println("Ligado: " + c1.estaligado());

        System.out.println("Giro motor: " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Acelerou -> Giro motor: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("Freiou -> Giro motor: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("Travou em 600 -> Giro motor: " + c1.motor.giros());

        c1.desligar(); // Desliguei o motor

    }
}
