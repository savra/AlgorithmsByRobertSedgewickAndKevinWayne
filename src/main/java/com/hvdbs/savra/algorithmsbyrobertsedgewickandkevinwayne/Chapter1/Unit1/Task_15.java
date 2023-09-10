package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.15
*/
public class Task_15 {
    public static void main(String[] args) {
        int[] source = new int[] {1, 1, 2, 1, 3, 4, 5, 5, 5, 6, 4, 2, 1};
        int[] histogram = histogram(source, 9);

        for (int i : histogram) {
            System.out.println(i);
        }
    }

    private static int[] histogram(int[] a, int M) {
        int[] result = new int[M];

        for (int i = 0; i < M; i++) {
            int count = 0;

            for (int k : a) {
                if (k == i) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}

/*
Result:
0
4
2
1
2
3
1
0
0
*/