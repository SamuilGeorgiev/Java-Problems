import java.util.Arrays;
import java.util.Scanner;

public class ObrabotkaNaMaisv {
    static Scanner scanner = new Scanner(System.in);

    private static int[] readArray() {
        System.out.println("Enter the number of elements of the array");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the next number:");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int getMinElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void swapElementsInArray(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static void multiplyElement(int[] array, int multiplier, int elementIndex) {
        if (elementIndex >= 0 && elementIndex < array.length) {
            array[elementIndex] *= multiplier;
        } else {
            System.out.println("Invalid index");
        }
    }


    public static void main(String[] args) {
        int[] array = readArray();

        System.out.println("Original Array:");
        printArray(array);

        int sum = getSum(array);
        System.out.println("Sum: " + sum);

        int[] myArray = {1, 2, 3, 4};
        swapElementsInArray(myArray, 2, 3);
        System.out.println("Array after swapping elements:");
        printArray(myArray);

        multiplyElement(array, 4, 3);

        System.out.println("Array after multiplying element at index 10:");
        printArray(array);
    }
}

