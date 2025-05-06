package Aula03_Keywords.keywords;

public class Client {

    private String name;

    private int age;

    private Address address = new Address(); // Como estamos no mesmo package ele libera o acesso a classe default

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
