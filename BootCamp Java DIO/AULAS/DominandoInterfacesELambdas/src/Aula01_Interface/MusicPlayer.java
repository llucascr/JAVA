package Aula01_Interface;

public interface MusicPlayer {

    public final String music = "Chuva de Arroz"; // interface trabalhão com propriedades/atributos public final static

    String cantor = "Luan Santana";

    public abstract void playMusic(); // no interface os metodos não podem ter corpo

    void pauseMusic();

    void stopMusic();

}
