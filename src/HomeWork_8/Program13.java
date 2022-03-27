package HomeWork_8;

import java.util.Scanner;

/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
 */
public class Program13 {
    public static boolean hasSharedDigit(int a, int b) {
//if one number is out of range
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int a1, a2, b1, b2;
        a1 = a % 10;
        a2 = a / 10;
        b1 = b % 10;
        b2 = b / 10;
        //if one common digit
        if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter 1st value :");
        int a = scr.nextInt();
        System.out.print("Enter 2nd value :");
        int b = scr.nextInt();
        //driver code
        System.out.println("Shared digit sum : " + hasSharedDigit(a, b));
    }
}







