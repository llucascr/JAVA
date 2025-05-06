package Aula01_Interface;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Music:" + MusicPlayer.music); // atributo static chamado pela classe MusicPlayer
//        System.out.println("Cantor:" + MusicPlayer.cantor);

        MusicPlayer musicPlayer = new MusicPlayer() { // Classe anonima

            Boolean tocando = false;

            @Override
            public void playMusic() {
                tocando = true;
                System.out.println("Tocando a musica");
            }

            @Override
            public void pauseMusic() {
                if (!tocando) {
                    System.out.println("Musica não esta tocando para ser pausada");
                    return;
                }
                System.out.println("Musica pausada");
            }

            @Override
            public void stopMusic() {
                if (!tocando) {
                    System.out.println("A musica ja esta parada");
                    return;
                }
                System.out.println("Musica parada");
            }
        };

        musicPlayer.playMusic();
        musicPlayer.pauseMusic();

    }
}
