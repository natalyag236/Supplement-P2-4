import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHasher {

    public static String hashString(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes());

        StringBuilder hexResult = new StringBuilder();
        for (byte b : hashBytes) {
            hexResult.append(String.format("%02x", b));
        }

        return hexResult.toString();
    }

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
