package OrientadoObjetos.Heranca;

public class Aula155_Heranca {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println("Vida heroi: " + heroi.vida);
        System.out.println("Vida monstro: " + monstro.vida);

        heroi.atacar(monstro);

        System.out.println("Vida heroi: " + heroi.vida);
        System.out.println("Vida monstro: " + monstro.vida);

    }
}
