package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.22
*/
public class Task_22 {
    public static void main(String[] args) {
        int[] source = new int[]{1, 3, 5, 4, 6, 8, 12, 14, 15, 16, 17, 21};

        System.out.println("The searched value is found by index " + rank(1, source));
    }

    public static int rank(int key, int[] a) {
        Integer recursionDepth = 1;
        return rank(key, a, 0, a.length - 1, recursionDepth);
    }

    public static int rank(int key, int[] a, int lo, int hi, Integer recursionDepth) {
        for (int i = 0; i < recursionDepth; i++) {
            System.out.print(" ");
        }

        System.out.print("lo = " + lo + ", hi = " + hi);
        System.out.println();

        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, ++recursionDepth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, ++recursionDepth);
        } else {
            return mid;
        }
    }
}

/*
Result:
 lo = 0, hi = 11
  lo = 0, hi = 4
   lo = 0, hi = 1
The searched value is found by index 0
*/