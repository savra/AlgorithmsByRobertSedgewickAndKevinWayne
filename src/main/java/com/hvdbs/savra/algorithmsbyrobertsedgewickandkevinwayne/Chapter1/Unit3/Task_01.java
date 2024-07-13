package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit3;

import edu.princeton.cs.algs4.StdOut;

/*
  ex. 1.3.1
*/
public class Task_01 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
        stack.push("Hello");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("World");

        if (stack.isFull()) {
            System.out.println("Full stack");
        }
    }
}

class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int capacity) {
        a = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public boolean isFull() {
        return N == a.length;
    }
}

/*
Result:
added method isFull
*/