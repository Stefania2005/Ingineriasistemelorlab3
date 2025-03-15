import java.security.SecureRandom;

public class StringRandomizer {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTU";
    private static final SecureRandom random = new SecureRandom();

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
