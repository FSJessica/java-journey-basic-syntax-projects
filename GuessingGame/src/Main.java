//2. Jogo de Adivinhação 🎯
//🔹 Descrição: Gere um número aleatório e armazene em um array. O usuário precisa adivinhar.
//🔹 Desafios Extras:
//✅ Permitir 3 tentativas.
//✅ Mostrar os palpites errados do usuário.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try{
            RandomNumber.displayMessage();
        } catch (InterruptedException e){
            System.out.println("Ocorreu uma interrupção: " + e.getMessage());
        }

        RandomNumber.randomizedNumber();
        RandomNumber.matchRandomNumber();
        RandomNumber.showWrongGuesses();

    }



}
