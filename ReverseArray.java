import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static Scanner scanner = new Scanner(System.in);
    static int[] array = new int[10];

    private static int[] readArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the next number:");
            array[i] =  scanner.nextInt();
        }
        return array;
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[10 - 1 - i];
        }
        return reversedArray;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] inputArray = readArray();
        System.out.print("Input array: ");
        printArray(inputArray);
        int[] reversedArray = reverseArray(inputArray);
        System.out.print;
        ;
    }
}
