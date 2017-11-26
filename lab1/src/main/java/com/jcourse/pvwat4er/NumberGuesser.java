package com.jcourse.pvwat4er;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {


    public static void main(String[] args) {
        int i = new Random().nextInt(100) + 1;
        // 1 + new Random().nextInt()%100;
        int s = 0;
        int j = 1;
        while (j <=8){
            Scanner scanner = new Scanner(System.in);
            s = Integer.parseInt(scanner.nextLine());
            if (i == s) {
                System.out.println("Ура! Это "+ s);
                j = 9;

            }
            else if (i >= s) {System.out.println("Загаданное число больше "+s);}
            else  {System.out.println("Загаданное число меньше "+s);};
            j++;
        }
        if (!(i == s)) {System.out.println("Загаданное число = "+i);}



    }
}

