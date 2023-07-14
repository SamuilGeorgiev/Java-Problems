package chapter9;

public class reversedDigits {

        public static void main(String[] args) {
            int number = 256;
            printDigitsInReverse(number);
        }

        public static void printDigitsInReverse(int number) {

            String numberString = String.valueOf(number)  ;


            String reversedString = new StringBuilder(numberString).reverse().toString();

            System.out.println("Числото" + number + " отпечатан вобратен  ред ре"+ reversedString);
        }
    }


