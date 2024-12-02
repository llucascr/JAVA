package OrientacaoObjetos.Metodos;

public class Calculadora {
    // metodos
    // <modificador de acesso> <retorno> <nome>
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multDoisNumeros(int num1, int num2) {
        imprime(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        // resolve case 1 erro
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void divideDoisNumeros2(double num1, double num2) {
        // resolve case 1 erro
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void imprime(double result) {
        System.out.println(result);
    }

    public void alteraDoiNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros:");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma Array: " + soma);
    }

    // Varargs
    // O varargs precisa ser o ultimo dos parametros caso você tenha mais de 1
    public void somaVarargs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma Varargs: " + soma);
    }
}
