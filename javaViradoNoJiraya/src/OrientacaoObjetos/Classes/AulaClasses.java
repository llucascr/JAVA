package OrientacaoObjetos.Classes;

public class AulaClasses {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Lucas";
        estudante.idade = 19;
        estudante.sexo = 'M';

        estudante2.nome = "Iris";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        // Referencia de Objeto
        estudante = estudante2;

        System.out.println("Estudante 1");
        System.out.println(estudante.nome); // Lucas
        System.out.println(estudante.idade); // 19
        System.out.println(estudante.sexo); // M
//        System.out.println(estudante); // endereço de memoria

        System.out.println("Estudante 2");
        System.out.println(estudante.nome); // Lucas
        System.out.println(estudante.idade); // 19
        System.out.println(estudante.sexo); // M
//        System.out.println(estudante); // endereço de memoria

    }
}
