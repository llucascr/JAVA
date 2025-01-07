package OrientadoObjetos.Heranca;

// SuperClasse +Generica
public class Jogador {

    int vida = 100;
    int x;
    int y;

//    Jogador() {
//        this(0,0);
//    }

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponete) {

        int deltaX = Math.abs(x - oponete.x);
        int deltaY = Math.abs(y - oponete.y);

        if (deltaX == 0 && deltaY == 1) {
            oponete.vida -= 10;
        } else if (deltaX == 1 && deltaY == 0) {
            oponete.vida -= 10;
        }else {
            return false;
        }

        return true;
    }

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> y--;
            case LESTE -> x++;
            case SUL -> y++;
            case OESTE -> x--;
        }

        return true;
    }
}
