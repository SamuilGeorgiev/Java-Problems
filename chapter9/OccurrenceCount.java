package chapter9;

public class OccurrenceCount {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 2, 5, 8, 5, 4, 9};
        int targetNumber = 5;
        int occurrences = countOccurrences(numbers, targetNumber);

        System.out.println("Числото се среща " + occurrences + " пъти в масива.");
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;

        for (int number : array)
        {
            if (number == target)

            {
                count++;
            }
        }

        return count;
    }
}
