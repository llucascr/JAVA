package Aula01_CriandoPrimeiraClasse;

import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();


    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public void incAge() {
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
    }

    // metodo estatico acessado pela classe e não pela sua instancia
    public static void test() {
        System.out.println("Static");
    }

    // Atibutos e metodos get e set estaticos
    private static String test;

    public static String getTest() {
        return test;
    }

    public static void setTest(String test) {
//        this // metodos staticos nao tem acesso ao this e nem atributos que nao sao staticos
        Person.test = test;
    }
    // ----------------------------------------------

    public String getName() {
        return name;
    }

    // Como declarei name como final não podemos criar um setName
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}
