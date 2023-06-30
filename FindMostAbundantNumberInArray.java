
import java.util.Arrays;
public class FindMostAbundantNumberInArray {
    public static void main(String[] args) {
        int max  = 0;
        int[]array = {4,5,6,6,4,3,2,4,5,6,7,8,9,0,9,9,8,8,5,5,6,6,3,3,4,5,6,7,8,6,5,3,3,4};
        for (int i = 0; i <= array.length -1;i++){
            int n = 0;
            for(int j = 0; j<= array.length - 1;j++){
                if(array[i]==array[j]){
                    n = n + 1;
                    n = max;


                }
            }
        }
        System.out.print(max);

    }
}
