import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringArrayHandlerTest {

    private StringArrayHandler handler;

    @BeforeEach
    public void setUp() {
        // Initialize the array handler with a fixed size for each test
        handler = new StringArrayHandler(5);
    }

    @Test
    public void testInsertAtValidIndex() {
        handler.insert("Hello", 0);
        handler.insert("World", 3);
        
        assertEquals("Hello", handler.getStringAt(0));
        assertEquals("World", handler.getStringAt(3));
    }

    @Test
    public void testInsertWithOverflow() {
        handler.insert("Fly", 7); // 7 % 5 = 2
        handler.insert("Eagles", 10); // 10 % 5 = 0
        
        assertEquals("Fly", handler.getStringAt(2));
        assertEquals("Eagles", handler.getStringAt(0));
    }

    @Test
    public void testInsertReplacesExistingValue() {
        handler.insert("Initial", 0);
        handler.insert("Replaced", 5); // 5 % 5 = 0, 
        
        assertEquals("Replaced", handler.getStringAt(0));
    }

    @Test
    public void testInsertAtAllIndices() {
        for (int i = 0; i < 5; i++) {
            handler.insert("Value" + i, i);
        }
        
        for (int i = 0; i < 5; i++) {
            assertEquals("Value" + i, handler.getStringAt(i));
        }
    }
}
