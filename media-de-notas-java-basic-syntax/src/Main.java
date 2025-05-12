import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNotas = 4;
        double somaNotas = 0;

        for (int i = 1; i <= totalNotas; i++) {
            System.out.println("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / totalNotas;
        System.out.printf("A média do aluno é : %.1f\n", media);
        scanner.close();
    }

}