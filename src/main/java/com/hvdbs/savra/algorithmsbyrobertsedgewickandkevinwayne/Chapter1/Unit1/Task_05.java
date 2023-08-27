package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.5
*/
public class Task_05 {
    public static void main(String[] args) {
        double x = 0.1;
        double y = 23.22;

        System.out.println("x = " + x + ", y = " + y + " ---> " + ((x >= 0 && x <= 1) && (y >= 0 && y <= 1)));

        x = 0.0000001;
        y = 1.000000000000001;

        System.out.println("x = " + x + ", y = " + y + " ---> " + ((x >= 0 && x <= 1) && (y >= 0 && y <= 1)));

        x = 0.5;
        y = 0.000000000000009;

        System.out.println("x = " + x + ", y = " + y + " ---> " + ((x >= 0 && x <= 1) && (y >= 0 && y <= 1)));
    }
}

/*
Result:
x = 0.1, y = 23.22 ---> false
x = 1.0E-7, y = 1.000000000000001 ---> false
x = 0.5, y = 9.0E-15 ---> true
*/