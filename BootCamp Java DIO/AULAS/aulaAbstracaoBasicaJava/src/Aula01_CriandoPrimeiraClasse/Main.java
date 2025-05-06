package Aula01_CriandoPrimeiraClasse;

public class Main {

    public static void main(String[] args) {
        Person male = new Person("Lucas");
//        male.name = "Lucas"; // ERRO: Encapsulamento dos atributos
//        male.setName("Lucas");
//        male.age = 19;
//        male.setAge(19);
        male.incAge();
        Person female = new Person("Iris");
//        female.name = "Iris";
//        female.setName("Iris");
//        female.age = 19;
//        female.setAge(19);
        female.incAge();

        System.out.println(male.getName() + " " + male.getAge() + " ");
        System.out.println(female.getName() + " " + female.getAge());

        // metodo estatico acessamos pela classe e não pela sua instancia
//        Person.test();
    }
}