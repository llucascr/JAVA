package OrientadoObjetos.ClasseAbstrata;

public abstract class Mamifero extends Animal{

    // Se eu nao implementar esse metodo em mamifero, aonde eu extender essa
    // classe abstrata vou ter que implementar os metodos mamar e mover
//    @Override
//    public String mover() {
//        return "Usando as patas";
//    }

    // Se o metodo for final, eu nao posso reescrever ele nas outras classes
//    @Override
//    public final String mover() {
//        return "Saindo do lugar";
//    }

    public abstract String mamar();
}
