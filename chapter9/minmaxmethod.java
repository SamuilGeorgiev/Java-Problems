package chapter9;

import java.util.Scanner;

public class minmaxmethod {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете първо число");

        int num1 = scanner.nextInt();
        System.out.print("Въведете торо число:");
        int num2 = scanner.nextInt();

        System.out.print("въведете трето число:");

        int num3 = scanner.nextInt();

        int max = getMax(num1, num2, num3);

        System.out.println("Най-голямото число е" + max);
    }



    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
