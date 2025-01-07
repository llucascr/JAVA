package OrientadoObjetos.Heranca;

public class Aula155_Heranca {
    public static void main(String[] args) {

        Heroi heroi = new Heroi(10, 10);

        Monstro monstro = new Monstro(10, 11);

        System.out.println("Vida heroi: " + heroi.vida);
        System.out.println("Vida monstro: " + monstro.vida);

        heroi.atacar(monstro);

        System.out.println("Vida heroi: " + heroi.vida);
        System.out.println("Vida monstro: " + monstro.vida);

    }
}
