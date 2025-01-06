package OrientadoObjetos.ENUM;

public class Aula154_ENUM {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);

        System.out.println("x = " + j1.x);
        System.out.println("y = " + j1.y);
    }
}
