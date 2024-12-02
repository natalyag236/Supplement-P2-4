import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.security.NoSuchAlgorithmException;

public class StringHasherTest {

    @Test
    public void testHashString() throws NoSuchAlgorithmException {
        String input = "Fly, Eagles!";
        String expectedHash = "2e689353ffe0d4ddc738dc1047df25ed40c9f63e48a07b6017df890e9faee538";

        String actualHash = StringHasher.hashString(input);

        assertEquals(expectedHash, actualHash, "The hash values should be equal.");
    }
}
