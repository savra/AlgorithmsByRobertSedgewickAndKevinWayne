package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.9
*/
public class Task_09 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(76));
        System.out.println(toBinaryString(77));
        System.out.println(toBinaryString(145));
        System.out.println(toBinaryString(763));
    }

    private static String toBinaryString(int N) {
        StringBuilder sb = new StringBuilder();

        while(N > 0) {
            sb.insert(0, (N % 2));
            N /= 2;
        }

        return sb.toString();
    }
}
// 72

/*
Result:

*/