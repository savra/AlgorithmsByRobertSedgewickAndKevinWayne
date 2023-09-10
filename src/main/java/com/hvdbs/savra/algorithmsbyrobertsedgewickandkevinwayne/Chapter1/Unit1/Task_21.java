package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

import edu.princeton.cs.algs4.StdIn;

/*
  ex. 1.1.21
*/
public class Task_21 {
    public static void main(String[] args) {
        String in = StdIn.readLine();
        String[] strings = in.split(" ");
        String name = strings[0];
        int firstDigit = Integer.parseInt(strings[1]);
        int secondDigit = Integer.parseInt(strings[2]);
        double result = (double) firstDigit / secondDigit;

        System.out.printf("%s %d %d %.3f", name, firstDigit, secondDigit, result);
    }
}

/*
Result:
John 24 3
John 24 3 8.000
*/