package Chapter8Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class FindNumbersInArray {
    public static void main(String [] args){
        int [] arr = {4, 3, 1, 4, 2, 5, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въдедете числото за сумата от числата на която трябва да търсим");
        int sum = scanner.nextInt();
        for(int i = 0; i <= arr.length; i++){
            sum += 1;
        }
        System.out.println();


    }

}
