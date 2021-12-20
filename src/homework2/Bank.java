package homework2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int a = in.nextInt();
        System.out.println("Введите % ставку: ");
        int b = in.nextInt();
        System.out.println("Введите срок вклада: ");
        int c = in.nextInt();
        double sum =a;
        int k=0;
        for (int i = 1; i <=c; i++) {
            k+=(sum*b/100);
            sum=(sum*b)/100+sum;
            System.out.println("Накопленная сумма за "+i+" лет: "+sum);
            System.out.println("Накопленные проценты за "+i+" лет: "+(k));
        }
    }
}
