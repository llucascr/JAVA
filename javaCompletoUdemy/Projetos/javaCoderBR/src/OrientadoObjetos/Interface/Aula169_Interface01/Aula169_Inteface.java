package OrientadoObjetos.Interface.Aula169_Interface01;

public class Aula169_Inteface {
    public static void main(String[] args) {

        Carro civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        civic.acelerar();
//        civic.acelerar();

//        ferrari.acelerar(); // 15
//        ferrari.ligarTurbo();
//        ferrari.acelerar(); // 35

        // 1
//        ferrari.ligarTurbo();
//        ferrari.acelerar();

        // 2
//        ferrari.ligarTurbo();
//        ferrari.ligarAr();
//        ferrari.acelerar();

        // 3
//        ferrari.acelerar();

        // 4 (else)
        ferrari.ligarAr();
        ferrari.acelerar();

        System.out.println("Velocidade Civi: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);

    }
}