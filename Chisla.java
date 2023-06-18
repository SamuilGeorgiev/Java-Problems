import java.util.Scanner;

public class Chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 9");
        int number = scanner.nextInt();


        if(number >= 1 && number <= 9){
            if(number >= 1 && number <= 3){
                System.out.println(number * 10);
            }else if(number >= 4 && number <= 6){
                System.out.println(number * 100);
            } else if (number >= 7 && number <=9) {
                System.out.println(number * 1000);
            }

        } else if (number <= 0 || number > 9) {
            System.out.println("Error");

        }

        System.out.println("Enter number");
        int number1 = scanner.nextInt();

        while (number1 >= 1 && number1 <= 9){
            while(number1 >= 1 && number1 <= 3){
                System.out.println(number1 * 10);
                number1++;

            }
            number1++;

        }





    }
}
