package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.24
*/
public class Task_24 {
    public static int gcd(int p, int q) {
        System.out.println("p = " + p + " q = " + q);
        if (q == 0) {
            return p;
        }

        int r = p % q;

        return gcd(q, r);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Should be passed 2 arguments");
        }

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println("Argument 1 = " + firstNumber + "; Argument 2 = " + secondNumber + ";");

        gcd(firstNumber, secondNumber);
    }
}

/*
Result:
Argument 1 = 105; Argument 2 = 24;
p = 105 q = 24
p = 24 q = 9
p = 9 q = 6
p = 6 q = 3
p = 3 q = 0

Argument 1 = 1111111; Argument 2 = 1234567;
p = 1111111 q = 1234567
p = 1234567 q = 1111111
p = 1111111 q = 123456
p = 123456 q = 7
p = 7 q = 4
p = 4 q = 3
p = 3 q = 1
p = 1 q = 0

*/