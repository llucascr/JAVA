package EstruturasCondicionais;

public class AulaEstruturasCondicionais {
    public static void main(String[] args) {
//        int idade = 15;
//        boolean isAutorizado = idade > 18;
//
//        if(isAutorizado){
//            System.out.println("Maior de Idade");
//        }
//
//        if(!isAutorizado){
//            System.out.println("Menor de Idade");
//        }

        // -------------------------------------------------------------------
        // idade < 15 categoria infaltil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade > 18 categoria adulto

//        int idade = 17;
//        String categoria;
//
//        if(idade < 15){
//            categoria = "Categoria Infantil";
//        }else if (idade >= 15 && idade < 18) {
//            categoria = "Categoria Juvenil";
//        } else {
//            categoria = "Categoria Adulto";
//        }
//
//        System.out.println(categoria);

        // -------------------------------------------------------------------
        // Doar se salario > 5000
//        double salario = 3000D;
//        String mensagemDoar = "Eu vou doar 500 pro DevDojo!";
//        String mensagemNaoDoar = "Ainda não tenho condições";
//
//        // String resultado = (condicao) ? verdadeiro : falso;
//        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
//
//        System.out.println(resultado);

        // -------------------------------------------------------------------
        // Switch
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;

        // char, int, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }

    }
}
