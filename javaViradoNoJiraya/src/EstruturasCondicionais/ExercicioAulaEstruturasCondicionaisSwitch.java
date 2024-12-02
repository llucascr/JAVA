package EstruturasCondicionais;

public class ExercicioAulaEstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana. Considerando 1 como Domingo

        int dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Hoje é Domingo, final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana!");
                break;
            case 7:
                System.out.println("Hoje é Sabado, final de semana!");
            default:
                System.out.println("Opção Invalida!");
                break;
        }
    }
}
