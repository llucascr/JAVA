package Aula03_Keywords;


import Aula03_Keywords.keywords.Client;

public class Main {

    public static void main(String[] args) {

        // Esse erro acontece pois essa classe tem um modificador default e quando temos
        // ele não podemos acessar ele de fora do package dele
        Client user = new Client();

        System.out.println(user.getAddress());

    }
}
