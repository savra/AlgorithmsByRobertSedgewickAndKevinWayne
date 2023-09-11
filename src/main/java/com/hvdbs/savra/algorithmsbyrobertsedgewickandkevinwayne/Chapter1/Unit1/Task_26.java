package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.26
*/
public class Task_26 {
    public static void main(String[] args) {
        sort(1,3, 2, 5);
        System.out.println();
        sort(4,1, 2, 3);
        System.out.println();
        sort(2,4, 1, 3);
    }

    private static void sort(int a, int b, int c, int t) {

        System.out.println("Before sort: a = " + a + " b = " + b + " c = " + c);
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        if (a > c) {
            t = a;
            a = c;
            c = t;
        }

        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        System.out.println("After sort: a = " + a + " b = " + b + " c = " + c);
    }
}

/*
Result:
a = 1 b = 2 c = 3
a = 1 b = 2 c = 4
a = 1 b = 2 c = 4
*/