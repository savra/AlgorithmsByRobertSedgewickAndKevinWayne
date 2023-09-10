package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.16
*/
public class Task_16 {
    public static void main(String[] args) {
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }

        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}

/*
Result:
311361142246
*/