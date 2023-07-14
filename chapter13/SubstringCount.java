package chapter13;

public class SubstringCount {
    public static void main(String[] args) {
        String text = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.";
        String substring = "in";

        int count = SubstringOccurrence(text,substring);
        System.out.println("Брой на срещанията на подниза'" +substring + "'в текста e" + count);
    }

    public static int SubstringOccurrence(String text,String substring) {
        int count = 0;

        int index = 0;

        while (index != -1) {
            index = text.indexOf(substring, index);

            if (index != -1) {
                count++;

                index += substring.length();
            }
        }

        return count;
    }
}
