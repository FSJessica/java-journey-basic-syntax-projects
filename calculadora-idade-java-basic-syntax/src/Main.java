import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos descobrir sua idade!\n" +
                           "Digite o ano que você nasceu!");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o mês que você nasceu (1-12)");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o dia que você nasceu");
        int diaNascimento = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(anoNascimento,mesNascimento,diaNascimento);
        LocalDate dataAtual = LocalDate.now();

        Period idade = Period.between(dataNascimento, dataAtual);

        System.out.println("Sua idade atualmente é: " + idade.getYears());
        scanner.close();
    }
}