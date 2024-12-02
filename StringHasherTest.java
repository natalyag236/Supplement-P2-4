import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.security.NoSuchAlgorithmException;

public class StringHasherTest {

    @Test
    public void testHashString() throws NoSuchAlgorithmException {
        String input = "Fly, Eagles!";
        String expectedHash = "b80352d0f26e95e1d980d5f94bb46f6b831d2a267c42d59e99cdd8a9ca17331d";

        String actualHash = StringHasher.hashString(input);

        assertEquals(expectedHash, actualHash, "The hash values should be equal.");
    }
}
