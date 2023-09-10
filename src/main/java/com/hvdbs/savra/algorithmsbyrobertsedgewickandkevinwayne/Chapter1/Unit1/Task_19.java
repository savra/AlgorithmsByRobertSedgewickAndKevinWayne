package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

import edu.princeton.cs.algs4.StdOut;

import static com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1.Fibonacci.F;

/*
  ex. 1.1.19
*/
public class Task_19 {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }
    }
}

class Fibonacci {
    public static long F(int N) {
        if (N == 0) {
            return 0;
        }

        if (N == 1) {
            return 1;
        }

        long[] result = new long[N + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= N; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[N];
    }
}

/*
Result:
The highest value that can be calculated in less than an hour is 65

After the improvement, the calculation of 100 values took less than 1s
*/