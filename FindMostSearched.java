import java.util.Scanner;

public class FindMostSearched{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuvedete chilso");
        int number = scanner.nextInt();
        System.out.println("vuvedete the comparator");
        int comparator = scanner.nextInt();
        if (number > comparator){
            System.out.println(number);
        }
    }

}
