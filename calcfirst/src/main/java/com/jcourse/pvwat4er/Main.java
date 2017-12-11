package com.jcourse.pvwat4er;

import java.io.*;
import java.util.Map;
import java.util.Stack;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Class.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Scanner scanner;
        String s;
        Stack<Double> stack = new Stack();

        if (args.length > 0) {
            scanner = new Scanner(new FileInputStream(args[0]));
        } else {
            scanner = new Scanner(System.in);
        }


        Map<String, Double> varMap = new HashMap<>();

        while ( scanner.hasNextLine() ) {

            s = scanner.nextLine();

            String[] str = s.split(" ");

            String s0 = str[0];
        }
 }
}