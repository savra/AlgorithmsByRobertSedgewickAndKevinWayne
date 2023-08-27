package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.3
*/
public class Task_03 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("The number of arguments must be equal to 3");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}

/*
Result:
1 2 3 -> Not equal
1 2 2 -> Not equal
2 2 2 -> Equal
2 2 1 -> Not equal
*/