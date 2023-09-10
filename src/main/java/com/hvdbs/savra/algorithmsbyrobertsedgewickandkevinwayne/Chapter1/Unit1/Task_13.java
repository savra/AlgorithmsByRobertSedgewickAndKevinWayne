package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.13
*/
public class Task_13 {
    public static void main(String[] args) {
        int[][] sourceArray1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("FIRST CASE");
        transposeArray(sourceArray1);

        int[][] sourceArray2 = new int[][]{
                {1, 2, 3, 4, 5},
                {7, 8, 9, 10, 11}
        };

        System.out.println("SECOND CASE");
        transposeArray(sourceArray2);

        int[][] sourceArray3 = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        System.out.println("THIRD CASE");
        transposeArray(sourceArray3);
    }

    private static void transposeArray(int[][] source) {
        System.out.println("Source array:");

        printArray(source);

        int[][] result = new int[source[0].length][source.length];

        for(int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                result[j][i] = source[i][j];
            }
        }

        System.out.println();
        System.out.println("Array after transpose:");

        printArray(result);
        System.out.println();
    }

    private static void printArray(int[][] source) {
        for (int[] ints : source) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }

}

/*
Result:
FIRST CASE
Source array:
1 2 3
4 5 6
7 8 9

Array after transpose:
1 4 7
2 5 8
3 6 9

SECOND CASE
Source array:
1 2 3 4 5
7 8 9 10 11

Array after transpose:
1 7
2 8
3 9
4 10
5 11

THIRD CASE
Source array:
1 2
3 4
5 6
7 8
9 10

Array after transpose:
1 3 5 7 9
2 4 6 8 10
*/