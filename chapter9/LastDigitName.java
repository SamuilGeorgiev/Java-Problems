public class LastDigitName {
    public static void main(String[] args) {
        int number = 512;

        String digitName = getDigitName(number);


        System.out.println("последната цифра на числото е " + digitName);
    }

    public static String getDigitName(int number) {
        int lastDigit = number % 10;

        switch (lastDigit) {
            case 0:
                return "zero";
            case 1:

                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "error";
        }
    }
}

