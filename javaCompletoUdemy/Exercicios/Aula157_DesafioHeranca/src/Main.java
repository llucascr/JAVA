public class Main {
    public static void main(String[] args) {

        Carro civic = new Civic();
        Carro ferrari = new Ferrari(400);

        civic.acelerar();
//        civic.acelerar();

        ferrari.acelerar();
//        ferrari.acelerar();

        System.out.println("Velocidade Civi: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);


    }
}