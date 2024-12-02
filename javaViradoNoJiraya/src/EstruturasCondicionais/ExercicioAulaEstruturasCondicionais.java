package EstruturasCondicionais;

public class ExercicioAulaEstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 70000F;
        double valorImposto;

        if(salario >= 0 && salario <= 34712){
            valorImposto = salario * 9.70 / 100;
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * 37.35 / 100;
        }else if (salario >= 68508){
            valorImposto = salario * 49.50 / 100;
        }else {
            System.out.println("Valor digitado eh Negativo");
            return;
        }

        System.out.println(valorImposto);
    }
}
