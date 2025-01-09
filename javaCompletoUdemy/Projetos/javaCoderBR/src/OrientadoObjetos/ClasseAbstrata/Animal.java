package OrientadoObjetos.ClasseAbstrata;

public abstract class Animal {

    // Grande diferença de classe abstrata e interface, na classe abstrata eu posso declarar metodos não abstratos
    public String respirar() {
        return "CO2";
    }

    // Classe generica que nao sei como cada animal anda
    public abstract String mover();
}
