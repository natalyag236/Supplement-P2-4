import java.util.Random;

public class RandomHexGenerator {

    /**
     * Generates a random hexadecimal string formatted as "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx".
     * The string consists of 32 random hexadecimal characters split into five groups with hyphens.
     *
     * @return A formatted string in the form of "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx".
     */
    public static String generateRandomHex() {
        Random random = new Random();
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            hexString.append(Integer.toHexString(random.nextInt(16)));
        }

        return String.format("%s-%s-%s-%s-%s",
            hexString.substring(0, 8),
            hexString.substring(8, 12),
            hexString.substring(12, 16),
            hexString.substring(16, 20),
            hexString.substring(20, 32)
        );
    }

    public static void main(String[] args) {
        String randomHex = generateRandomHex();
        System.out.println("Generated Hex String: " + randomHex);
    }
}
