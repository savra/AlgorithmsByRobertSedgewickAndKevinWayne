package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.11
*/
public class Task_11 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][] {
                {true,  true,  false, true},
                {true,  false, true,  true},
                {true,  true,  false, true},
                {false, true,  false, false}
        };

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("  ");

                for (int k = 0; k < arr[0].length; k++) {
                    System.out.print(k);

                    if (k != arr[0].length - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            System.out.print(i + " ");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }
}

/*
Result:

*/