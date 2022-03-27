package HomeWork_8;

import java.util.Scanner;

public class P2MinAndMaxInputChallenge {
    public static void minMax() {
        Scanner scr = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       // System.out.println("Max Init: " + max);
        //System.out.println("Min Init: " + min);
        while (true) {
            System.out.print("Enter a number : ");
            boolean isAnInt = scr.hasNextInt();//Validating syntax for integer number
            if (isAnInt) {
                int number = scr.nextInt();//Store a valid number
                if (number > max) { //if number is bigger than last Max number than store in max variable
                    max = number;
                   // System.out.println("If Max true: " + max);
                }
                if (number < min) { //if number is smaller than last Min number than store in min variable
                    min = number;
                   // System.out.println("If Min true: " + min);
                }
            } else {
                System.out.println("Invalid Number ");
                break;
            }
            scr.nextLine();
        }
        System.out.println("Maximum : =" + max + " and Minimum : = " + min);
        scr.close();
    }

    public static void main(String[] args) {
        minMax();
    }
}


