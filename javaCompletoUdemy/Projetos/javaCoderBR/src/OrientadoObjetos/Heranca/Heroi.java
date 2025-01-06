package OrientadoObjetos.Heranca;

// SubClasse de jogador
public class Heroi extends Jogador{
    // O heroi vai dar mais dano no ataque
    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);

        return ataque1 || ataque2;
    }
}
