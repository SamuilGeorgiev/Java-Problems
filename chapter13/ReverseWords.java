package chapter13;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "C# is not C++ and PHP is not Delphi";
        String reversed = reverseWords(sentence);

        System.out.println(reversed);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
        {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
