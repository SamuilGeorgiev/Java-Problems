import java.util.Scanner;

public class Matrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number between bellow 20 ");
        int number = scanner.nextInt();

        for(int i = 1; i <=  (number); i++){
            System.out.println(" ");
            for(int u = i; u <= number; u++){
                System.out.print(u);
            }

        }


    }
}
