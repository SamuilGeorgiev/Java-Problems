import java.util.Scanner;

public class HotelskiDni {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month");
        String month = scanner.nextLine();
        System.out.println("Enter the number of days");
        int days = scanner.nextInt();
        double apartamentPrice;
        double studioPrice;
        double apartamentRenta = 0;
        double studioRenta = 0;

        switch(month){
            case "may":
            case "october":
                apartamentPrice = 65;
                studioPrice = 50;

                apartamentRenta = apartamentPrice * days;
                studioRenta = studioPrice * days;

                if(days > 14) {
                    studioRenta *= 0.70;

                    apartamentRenta *= 0.90;
                } else if (days > 7) {
                    studioRenta *= 0.95;
                    
                }
            case "june":
            case "september":
                apartamentPrice = 68.70;
                studioPrice = 75.20;

                apartamentRenta = apartamentPrice * days;
                studioRenta = studioPrice * days;

                if (days > 14){
                    studioRenta *= 0.80;

                    apartamentRenta *= 0.90;
                }
            case "july":
            case "august":
                apartamentPrice = 77;
                studioPrice = 76;

                apartamentRenta = apartamentPrice * days;
                studioRenta = studioPrice * days;

                if (days > 14){

                    apartamentRenta *= 0.90;
                }



        }
        System.out.printf("%.2f" , apartamentRenta );
        System.out.println();
        System.out.printf("%.2f" , studioRenta);



    }
}
