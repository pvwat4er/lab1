package com.jcourse.pvwat4er;

import java.io.InputStreamReader;
import java.util.Scanner;
import static java.nio.charset.Charset.*;

public class MyClass {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        while (!s.equals("exit")){
            s = scanner.nextLine();
            System.out.println(s);
        }


    }
}
