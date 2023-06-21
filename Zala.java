import java.util.Scanner;

public class Zala {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = scanner.nextInt();
        double width = scanner.nextInt();
        double redove = lenght  / 120;
        double coloni = (width - 100) / 70;

        double mesta = (redove * coloni) - 3;
         System.out.println(mesta);
    }
}


Задача: генератор за пароли
Да се напише програма, която генерира произволна парола,с дължина 15 символа, 
на база на предварително зададени списъци със символи. 
Първоначално се създава парола от произволни символи взети от списъка с 
всички символи. След това да се добавят, на произволни места в паролата, по два символа от всеки
вид символи.
 

Входни данни
Обекти от тип String съдържащи символите които да участват в генерирането на 
паролата:
- Всички главни букви от латиснката азбука.
- Всички малки букви от латинската азбука.
- Числата от 0 до 9.
- Специални символи (10 броя произволни)  

Изходни данни
Разпечатана парола от 15 символа.





Добавка в условието на задачата за генератор на пароли: При добавянето на двата символа от всеки вид, НЕ трябва да се променят символи, вече добавени от преден вид. Например - ако сме добавили по една голяма буква на 3-то и 9-то място, когато добавяме двете малки букви, трябва да го правим на произволно място, с изключение на 3 и 9. Ако добавим малки букви на 5 и 10-то място, когато добавяме число, не трябва да го добавяме на 3, 9, 5 и 10-то място и т.н.