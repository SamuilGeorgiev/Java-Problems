import java.util.Random;

public class Parola {
    public static void main(String[] args) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()";
        String allCharacters = upperCase + lowerCase + numbers + specialCharacters;

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }
        System.out.println("Generated password: " + password);

    }
}
