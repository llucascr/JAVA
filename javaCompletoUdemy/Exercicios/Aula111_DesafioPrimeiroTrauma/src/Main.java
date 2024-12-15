public class Main {

    int a = 3;
    static int b = 4; // membro static pode acessar outro membro static

    public static void main(String[] args) {

        Main p = new Main();
        System.out.println(p.a);

        System.out.println(b);

    }
}