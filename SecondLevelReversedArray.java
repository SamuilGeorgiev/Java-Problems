import java.util.Arrays;
import java.util.Scanner;

public class SecondLevelReversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the next number:");
            array[10 - 1 - i] =  scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));




    }
}
