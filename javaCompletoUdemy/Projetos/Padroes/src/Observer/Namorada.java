package Observer;

public class Namorada implements ObserverChegadaAniversariante{

    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Surpresa!!!");
    }
}
