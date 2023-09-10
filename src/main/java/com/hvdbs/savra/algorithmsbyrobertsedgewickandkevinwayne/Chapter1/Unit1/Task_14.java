package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.14
*/
public class Task_14 {
    public static void main(String[] args) {
        System.out.println(lg(16));
        System.out.println(lg(17));
        System.out.println(lg(32));
        System.out.println(lg(1));
        System.out.println(lg(2));
        System.out.println(lg(0));
        System.out.println(lg(-1));
    }

    public static int lg(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("The argument must be positive");
        }

        int result = 0;

        while (N > 0) {
            N >>= 1;
            result++;
        }

        return result - 1;
    }
}

/*
Result:
4
4
5
0
6
Exception in thread "main" java.lang.IllegalArgumentException: The argument must be positive
*/