package ClassesMetodos.Aula106_MembrosClasseVsInstancia;

public class Aula106_MembrosClasseVsInstancia {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);

//        AreaCirc.pi = 3.1415; // quando uso o final junto com o static
                                // a variavel fica constante e nao pode ser mudada

        System.out.println(a.area());

        System.out.println(AreaCirc.areaStatic(6.6));

    }
}
