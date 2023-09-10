package com.hvdbs.savra.algorithmsbyrobertsedgewickandkevinwayne.Chapter1.Unit1;

/*
  ex. 1.1.18
*/
public class Task_18 {
    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
    }

    public static int mystery(int a, int b) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            return mystery(a * a, b / 2);
        }

        return mystery(a * a, b / 2) * a;
    }
}

/*
Result:
Values of mystery(2, 25) and mystery(3, 11) = 50 and 33 (This function performs the multiply operation)

After replacing + by *, a will be raised to degree b

Values of mystery(2, 25) and mystery(3, 11) = 33554432 and 177147
*/