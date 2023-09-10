package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.20
*/
public class Task_20 {
    public static void main(String[] args) {
        System.out.println("ln(5!) = " + lnFactorial(5));
        System.out.println("ln(12!) = " + lnFactorial(12));
        System.out.println("ln(21!) = " + lnFactorial(21));
    }

    private static double lnFactorial(int N) {
        if (N <= 1) {
            return 0;
        }

        return Math.log(N) + lnFactorial(N - 1);
    }
}

/*
Result:
ln(5!) = 4.787491742782046
ln(12!) = 19.98721449566189
ln(21!) = 45.38013889847691
*/