package OrientadoObjetos.Heranca;

// SubClasse de jogador
public class Heroi extends Jogador{

    // Aula159 - Herança#03
    Heroi(int x, int y) {
        super(x, y);
    }

    // O heroi vai dar mais dano no ataque
    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);

        return ataque1 || ataque2;
    }
}
