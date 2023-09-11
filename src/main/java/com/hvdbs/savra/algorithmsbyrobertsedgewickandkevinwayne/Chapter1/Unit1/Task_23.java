package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/*
  ex. 1.1.23
*/
public class Task_23 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("should be 2 arguments");
        }

        int existsInWhiteList = Integer.parseInt(args[1]);

        int[] whitelist = In.readInts(args[0]);

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();

            if (rank(key, whitelist) < 0) {
                if (existsInWhiteList > 0) {
                    StdOut.println(key);
                }
            } else {
                if (existsInWhiteList < 0) {
                    StdOut.println(key);
                }
            }
        }

    }
}

/*
Result:
INPUT
4

first argument:
tinyText.txt which contains
23
50
10
99
18
23
98
84
11
10
48
77
13
54
98
77
77
68

second argument:
5

Output
4

INPUT
23

first argument:
tinyText.txt which contains
23
50
10
99
18
23
98
84
11
10
48
77
13
54
98
77
77
68

second argument:
-2

Output
23
*/