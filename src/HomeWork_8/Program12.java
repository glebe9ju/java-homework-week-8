package HomeWork_8;

import java.util.Scanner;

/*
Write a programme to input any number and check if it is prime or not.
 */
public class Program12 {
    public static void prime() {
        Scanner scr = new Scanner(System.in);
        int i = 2;
        System.out.print("Enter the number : ");
        int num = scr.nextInt();
        boolean flag = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {
        prime();

    }
}
