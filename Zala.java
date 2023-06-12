import java.util.Scanner;

public class Zala {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = scanner.nextInt();
        double width = scanner.nextInt();
        double redove = lenght  / 120;
        double coloni = (width - 100) / 70;

        double mesta = (redove * coloni) - 3;
         System.out.println(mesta);
    }
}
