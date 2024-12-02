public class StringArrayHandler {

    private String[] array;

    // Constructor to initialize the array with a given size
    public StringArrayHandler(int size) {
        array = new String[size];
    }

    public void insert(String value, int index) {
        int targetIndex = index % array.length;  
        array[targetIndex] = value;
    }

    // Retrieves the value at the specified index
    public String getStringAt(int index) {
        return array[index];
    }

    // Displays all elements in the array with their respective indices
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + (array[i] != null ? array[i] : "empty"));
        }
    }
}
