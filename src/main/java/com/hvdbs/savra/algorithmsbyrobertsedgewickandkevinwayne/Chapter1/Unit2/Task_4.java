package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit2;

import edu.princeton.cs.algs4.StdOut;

/*
  ex. 1.2.4
*/
public class Task_4 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}

/*
Result:
world
hello
*/