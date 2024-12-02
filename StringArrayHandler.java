public class StringArrayHandler {

    private String[] array;

    /**
     * Constructor to initialize the array with a specified size.
     * 
     * @param size The size of the array.
     */
    public StringArrayHandler(int size) {
        array = new String[size];
    }

    /**
     * Inserts a string at the specified index in the array.
     * Uses modulus to handle overflow, wrapping the index if necessary.
     * 
     * @param value The string to insert.
     * @param index The index at which to insert the string.
     */
    public void insert(String value, int index) {
        int targetIndex = index % array.length;  
        array[targetIndex] = value;
    }

    /**
     * Retrieves the string at the specified index.
     * 
     * @param index The index of the desired string.
     * @return The string at the specified index.
     */
    public String getStringAt(int index) {
        return array[index];
    }

    /**
     * Displays all elements in the array with their respective indices.
     * If an element is null, "empty" is displayed.
     */
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + (array[i] != null ? array[i] : "empty"));
        }
    }
}
