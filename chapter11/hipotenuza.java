package chapter11;

import java.util.Scanner;

public class hipotenuza {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("дължината на първия катет:");
            double firstkatet = scanner.nextDouble();

            System.out.print("дължината на втория катет:");
            double secondkatet = scanner.nextDouble();

            double hypotenuse = calculateHypotenuse(firstkatet, secondkatet);

            System.out.println("хипотенузата на правоъгълния триъгълник е:" + hypotenuse);
        }

        public static double calculateHypotenuse(double firstkatet, double secondkatet) {
            return Math.sqrt(Math.pow(firstkatet, 2) + Math.pow(secondkatet, 2));
        }
    }


