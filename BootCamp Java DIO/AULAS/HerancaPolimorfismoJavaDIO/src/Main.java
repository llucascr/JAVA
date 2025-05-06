public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee(); // classe abstrata não pode ser instanciada
        Manager manager = new Manager();

        manager.setName("Lucas");
        manager.setLogin("lucas");
        manager.setPassword("123456");

        System.out.println("Name: " + manager.getName());
        System.out.println("Login: " + manager.getLogin());
        System.out.println("Password: " + manager.getPassword());
    }
}