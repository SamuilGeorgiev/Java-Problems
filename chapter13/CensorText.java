public class CensorText {
    public static void main(String[] args) {
        String text = "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.";
        String[] forbiddenWords = {"Java", "JVM", "Microsoft"};
        String result = censorText(text, forbiddenWords);
        System.out.println(result);
    }

    public static String censorText(String text, String[] forbiddenWords)
    {
        for (int i = 0; i < forbiddenWords.length; i++) {
            String word = forbiddenWords[i];

            StringBuilder stars = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                stars.append("*");
            }
            text = text.replaceAll("(?i)\\b" + word + "\\b", stars.toString());
        }
        return text;
    }
}
