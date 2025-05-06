import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "-----------------------------------\n" +
                "            CALCULADORA      \n" +
                "-----------------------------------");

        System.out.println("Primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Operador:");
        char operador = scanner.next().charAt(0);;

        System.out.println("Segundo número:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("\nA operação é: " +primeiroNumero+ " " +operador+ " " +segundoNumero);

        System.out.println("\n\nCalculando........");

        double result = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                result = primeiroNumero + segundoNumero;
                break;
            case '-':
                result = primeiroNumero - segundoNumero;
                break;
            case '*':
                result = primeiroNumero * segundoNumero;
                break;
            case '/':
                result = primeiroNumero / segundoNumero;
                break;
            default:
                System.out.println("Operador inválido!");
                operacaoValida = false;
                return;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + result);
        }

        scanner.close();
    }


}