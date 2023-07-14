package chapter11;

public class timemillsorigin {
    public static void main(String[] args) {
            long currentTimeMillis = System.currentTimeMillis();

            long totalSeconds = currentTimeMillis / 1000;
            long currentSeconds = totalSeconds % 60;

            long totalMinutes = totalSeconds / 60;
            long currentMinutes = totalMinutes % 60;

            long totalHours = totalMinutes / 60;
            long currentHours = totalHours % 24;

            long totalDays = totalHours / 24;

            System.out.println("От 1 януари 1970 година до сега има:");
            System.out.println("Дни" + totalDays);
            System.out.println("Часове" + currentHours);

            System.out.println("Минути" +currentMinutes);
        }
    }


