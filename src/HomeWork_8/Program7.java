package HomeWork_8;

import java.util.Scanner;

public class Program7 {
    public static int sumFirstAndLastDigit(int number) {
        //declare variable
        int lastDigit, firstDigit, divisor;
        int totalDigit = 0;
        int sum = 0;
        //find last digit
        lastDigit = number % 10;

        //find total number of digits
        totalDigit = findDigits(number);
        //calculator divisor value
        divisor = (int) Math.pow(10, totalDigit - 1);
        //find first digit
        firstDigit = number / divisor;

        // add value
        sum = firstDigit + lastDigit;
        return sum;
    }

    //method to find total number of digit
    private static int findDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
    //declare main method
    public static void main(String[] args) {
        //declare variable
        int number = 0;
        int sum = 0;
        // create scanner class object
        Scanner scan = new Scanner(System.in);
        //read input
        System.out.print("Enter an integer number :");
        number = scan.nextInt();
        //find sum of digit of number
        sum = sumFirstAndLastDigit(number);
        //display result
        System.out.println("The sum of first & last "+" digit of the number" + number + "=" + sum );

    }

}
