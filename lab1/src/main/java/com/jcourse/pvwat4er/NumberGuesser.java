package com.jcourse.pvwat4er;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {


    public static void main(String[] args) {
        int i = new Random().nextInt(100) + 1;
        int s = 0;
        int j = 0;
        while (j <= 7){
            j++;
            System.out.println("Попытка №" + j +": ");
            Scanner scanner = new Scanner(System.in);
            try {
                s = Integer.parseInt(scanner.nextLine());
                if ((s > 100) || (s < 1)) {
                    System.out.println("Загадано число от 1 до 100. Попытка потрачена впустую");
                }
                else if (i == s) {
                    System.out.println("Ура! Это "+ s);
                    break;
                }
                else if (i >= s) {
                    System.out.println("Загаданное число больше " + s);
                }
                else  {
                    System.out.println("Загаданное число меньше " + s);
                }


            }
            catch (NumberFormatException ex) {
                System.out.println("Введите натуральное число от 1 до 100. Ваша попытка сгорает");
            }




        }
        if ((i != s)) {System.out.println("GAME OWER, дружок! Загаданное число - "+i);}



    }


}

