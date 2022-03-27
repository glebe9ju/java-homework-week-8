package HomeWork_8;

import java.util.Scanner;

/*
6. Write a program in Java to display the pattern like a triangle with a number.
 */
public class Program6 {
    public static void triangle() {
        int i, j, r;
        Scanner scr = new Scanner(System.in);
        System.out.print("Input number of n :");
        r = scr.nextInt();
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        triangle();
    }
}