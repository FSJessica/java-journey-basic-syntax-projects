import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    private static int number;
    private static int inputUser;
    private static List<Integer> wrongGuess = new ArrayList<>();

    public static void displayMessage() throws InterruptedException {
        System.out.println("Vamos brincar de jogo de advinhação!");
        System.out.println("Você possui 3 chances para acertar um número entre 0 e 9");
        Thread.sleep(2000);
        System.out.println("Preparado(a)?!");
        Thread.sleep(2000);
        System.out.println("\nValendo!!");
    }

    public static void randomizedNumber(){
        Random random = new Random();
        number = random.nextInt(10);
//        System.out.println(number);

    }

    public static void matchRandomNumber(){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count<=2) {
            inputUser = scanner.nextInt();
            if (inputUser == number) {
                System.out.println("\uD83C\uDF89Você acertou! Parabéns!");
                break;
            } else if (inputUser < number){
                System.out.println("Errou! Dica: Tente um número maior");
                wrongGuess.add(inputUser);
            } else if (inputUser > number){
                System.out.println("Errou! Dica: Tente um número menor");
                wrongGuess.add(inputUser);
            }
            count ++;
        }
        if (count > 2){
            System.out.println("Ops! Acabaram suas chances \uD83D\uDE41!");
        }

    }

    public static void showWrongGuesses(){
        if (inputUser != number){
            System.out.println("Seus palpites foram: " + wrongGuess);
            System.out.println("O número correto era: " + number);
        }
    }
}
