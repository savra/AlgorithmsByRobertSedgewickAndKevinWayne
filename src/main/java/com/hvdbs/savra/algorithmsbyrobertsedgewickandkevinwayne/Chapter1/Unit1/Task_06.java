package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

import edu.princeton.cs.algs4.StdOut;

/*
  ex. 1.1.6
*/
public class Task_06 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++)
        {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}

/*
Result (Is Fibonacci sequence):
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
*/