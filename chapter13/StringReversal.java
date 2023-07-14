package chapter13;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете символен низ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Обърнат низ" + reversed);

        scanner.close();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--)
        {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}

