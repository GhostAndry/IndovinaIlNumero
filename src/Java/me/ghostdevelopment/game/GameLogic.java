package me.ghostdevelopment.game;

import me.ghostdevelopment.Utility;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    public static void gameMain(){
        try {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Numero range massimo: ");
            int numBound = scanner.nextInt();

            System.out.print("Tentativi massimi: ");
            int vite = scanner.nextInt();

            int randomNum = random.nextInt(numBound);

            while (vite > 0) {
                System.out.println("");
                System.out.print("Numero: ");
                int indNum = scanner.nextInt();

                if (indNum == randomNum) {
                    Utility.gameWin();
                    break;
                } else if (indNum < randomNum) {
                    vite = vite - 1;
                    System.out.println("Sbagliato! Il numero è maggiore");
                    System.out.println("Vite rimaste: " + vite);
                } else if (indNum > randomNum) {
                    vite = vite - 1;
                    System.out.println("Sbagliato! Il numero è minore");
                    System.out.println("Vite rimaste: " + vite);
                }
                if(vite==0){
                    Utility.gameLose();
                    System.out.println("\n"
                            + "Il numero era "+randomNum);
                    break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Internal Exceprion");
        }
    }
}
