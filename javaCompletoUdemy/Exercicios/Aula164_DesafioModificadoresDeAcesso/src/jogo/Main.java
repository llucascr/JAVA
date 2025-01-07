package jogo;

import componetes.Civic;
import componetes.Ferrari;

public class Main {
    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        civic.acelerar();
//        civic.acelerar();

        ferrari.acelerar();
//        ferrari.acelerar();

        System.out.println("Velocidade Civic: " + civic.mostrarVelocidade());
        System.out.println("Velocidade Ferrari: " + ferrari.mostrarVelocidade());


    }
}