import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RandomHexGeneratorTest {

    @Test
    public void testGenerateRandomHex() {
        String result = RandomHexGenerator.generateRandomHex();

        assertTrue(result.matches("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"));
    }
}
