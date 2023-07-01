/**Напишете метод, който връща позицията на първия елемент на масив,
 който е по-голям от двата свои съседи едновременно, или -1, ако няма
 такъв елемент.
 **/



public class Zadacha11I7 {
    public static void main(String[] args) {
        int[]array = {1,3,4,5,9,7,6,5,4,3,7,9,0,5,5,6,7,5,43,9,4,};
        int num = findFirstElement(array);
        System.out.println("The number is:" + num);

    }
    public static int findFirstElement(int[]array){
        for (int i = 1; i <= array.length -1; i++ ){
            if (array[i] > array[i+1] && array[i] > array[i-1]){
                return i;
            }
        }
        return -1;
    }

}
