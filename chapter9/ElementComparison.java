package chapter9;

public class ElementComparison {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 5};
        int position = 2;

        boolean is = isElementGreaterOrSmaller(array, position);

        if (is) {
            System.out.println("Елементът на позиция" + position + "е поголям или по-малък от двата му съседа");
        } else {
            System.out.println("Елементът на позиция" +position + "нее поголям или по-малък от двата му съседа");
        }
    }

    public static boolean isElementGreaterOrSmaller(int[] array, int position) {
      
        if (position < 1 || position >= array.length - 1) {
            return false;
        }

        int element = array[position];


        int previous = array[position - 1];
        int next = array[position + 1];


        if (element > previous && element > next) {
            return true;
        } else if (element < previous && element < next) {
            return true;


        } else {

            return false;

        }
    }
}
