package HomeWork_8;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class Program9 {
    public static void fibonaccinumber() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the series number : ");
        int n = scr.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci series " + n + "terms :");
        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm + "");
            int Z = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = Z;
        }
    }

    public static void main(String[] args) {
        fibonaccinumber();
    }
}
