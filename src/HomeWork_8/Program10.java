package HomeWork_8;

import java.util.Scanner;
//10. Write a program to input any number and check if it Armstrong number or not

public class Program10 {
    public static void armStrong() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input any number :");
        int num = scr.nextInt();
        int ori, remainder, result = 0;
        ori = num;
        while (ori != 0) {
            remainder = ori % 10;
            result += Math.pow(remainder, 3);
            ori /= 10;
        }
        if (result == num)
            System.out.println(num + "is an Armstrong number");
        else
            System.out.println(num + "is not an Armstrong number");
    }

        public static void main (String[]args){
            armStrong();
        }

    }

