package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

import edu.princeton.cs.algs4.StdOut;

/*
  ex. 1.1.7
*/
public class Task_07 {
    public static void main(String[] args) {
        A();
        B();
        C(50);
    }

    private static void A() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;

        System.out.print("A) ");
        StdOut.printf("%.5f\n", t);
    }

    private static void B() {
        System.out.print("B) ");

        int sum = 0;

        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }

    private static void C(int N) {
        System.out.print("C) ");

        int sum = 0;

        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < N; j++)
                sum++;
        StdOut.println(sum);
    }
}

/*
Result:
A) 3.00009
B) 499500
C) 500
*/