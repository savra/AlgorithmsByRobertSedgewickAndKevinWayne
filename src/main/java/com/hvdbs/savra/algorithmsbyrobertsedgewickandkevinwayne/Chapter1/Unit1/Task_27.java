package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.27
*/
public class Task_27 {
    private static long callsCount = 0;
    public static double binomial(int N, int k, double p) {
        callsCount++;
        if (N == 0 && k == 0) {
            return 1.0;
        }

        if (N < 0 || k < 0) {
            return 0.0;
        }

        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double enhancedBinomial(int N, int k, double p, Integer callsCount) {
        /*callsCount++;
        if (N == 0 && k == 0) {
            return 1.0;
        }

        if (N < 0 || k < 0) {
            return 0.0;
        }

        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);*/
        return 0;
    }


    public static void main(String[] args) {
        double binomial = binomial(20, 50, 0.25);

        System.out.println("Calls count for binomial(30, 50) = " + callsCount);
        callsCount = 0;
    //   System.out.println("Calls count for enhancedBinomial(30, 50) = " + count);
    }
}

/*
Result:

*/