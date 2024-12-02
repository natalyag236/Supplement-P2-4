import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility class for hashing strings using the SHA-256 algorithm.
 */
public class StringHasher {

    /**
     * Hashes a given input string using the SHA-256 algorithm.
     *
     * @param input The input string to be hashed.
     * @return The hexadecimal representation of the hashed string.
     * @throws NoSuchAlgorithmException If the SHA-256 algorithm is not available.
     */
    public static String hashString(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes());

        StringBuilder hexResult = new StringBuilder();
        for (byte b : hashBytes) {
            hexResult.append(String.format("%02x", b));
        }

        return hexResult.toString();
    }

    /**
     * Main method to demonstrate hashing a sample input string.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            String input = "Fly, Eagles!";
            String hashedValue = hashString(input);
            System.out.println("Hash: " + hashedValue);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not available: " + e.getMessage());
        }
    }
}
