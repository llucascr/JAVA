package OrientadoObjetos.ENUM;

public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao) {
//        if (direcao == direcao.NORTE) {
//            y++;
//        }
        switch (direcao) {
            case NORTE -> y--;
            case LESTE -> x++;
            case SUL -> y++;
            case OESTE -> x--;
        }

        return true;
    }
}
