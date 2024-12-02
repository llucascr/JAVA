package OrientacaoObjetos.Metodos;

public class MetodoEx {
    public void mediaSalarios(double[] salarios) {
        if(salarios == null) return;

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }

//        for (int i = 0; i < salarios.length; i++) {
//            System.out.println(salarios[i]);
//        }

        System.out.println("Media: " + media / salarios.length);
    }
}
