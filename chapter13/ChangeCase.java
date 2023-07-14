package chapter13;

public class ChangeCase {
    public static void main(String[] args) {
        String text = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
        String result = changeCase(text);
        System.out.println(result);
    }

    public static String changeCase(String text)
    {
        StringBuilder result = new StringBuilder();

        int startIndex = 0;


        int endIndex;

        while (startIndex < text.length()) {
            int startTagIndex = text.indexOf("<upcase>", startIndex);
            if (startTagIndex == -1) {
                result.append(text.substring(startIndex));
                break;
            }

            int endTagIndex = text.indexOf("</upcase>", startTagIndex);
            if (endTagIndex == -1) {
                result.append(text.substring(startIndex));
                break;
            }

            result.append(text, startIndex, startTagIndex);
            String uppercaseText = text.substring(startTagIndex   + 8, endTagIndex).toUpperCase();
            result.append(uppercaseText);

            startIndex = endTagIndex + 9;
        }

        return result.toString();
    }
}
