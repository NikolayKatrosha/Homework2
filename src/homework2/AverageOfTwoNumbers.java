package homework2;

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        average(a,b);
    }

    public static void average(double number1, double number2) {
        System.out.println((number1+number2)/2);
    }
}
