package OrientadoObjetos.ClasseAbstrata;

public class Aula171_ClasseAbstrata {
    public static void main(String[] args) {

        Mamifero a = new Cachorro();
        a.respirar();
        a.mamar();
        a.mover();

        Cachorro b = new Cachorro();
        b.respirar();
        b.mamar();
        b.mover();

        Animal c = new Cachorro();
        c.respirar();
//        c.mamar(); // ERRO
        c.mover();
    }
}
