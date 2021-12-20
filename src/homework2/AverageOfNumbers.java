package homework2;

import java.util.Scanner;

public class AverageOfNumbers {
    private static Object NumberUtils;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваши числа через пробел: ");
        int sum = 0;
        String s;
        int counter = 0;
        while (in.hasNextInt()) {
            s = in.next();
            int num = Integer.parseInt(s);
            sum += num;
            counter++;
        }
        System.out.println(sum/counter);
    }
}