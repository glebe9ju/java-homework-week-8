package HomeWork_8;

import java.util.Scanner;

public class P4DigitSumChallenge {

    public static int sumDigits(long n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input three digits : ");
        int digits = scr.nextInt();
        System.out.println("The sum is " + sumDigits(digits));


    }

}
