package HomeWork_8;

import java.util.Scanner;

public class P1ReadingUserInputChallenge {
    public static void test() {
        Scanner scr = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <=10) {
            System.out.print("Enter number " + count+":");

            boolean ans = scr.hasNext();
            if (ans) {
                int number = scr.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scr.nextLine();
        }
        System.out.println("Sum of all number =  " + sum);
        scr.close();//Scanner closed
    }
    public static void main(String[] args) {
        test();
    }
}
