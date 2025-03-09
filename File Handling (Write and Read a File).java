import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java File Handling!");
            writer.close();
            System.out.println("File written successfully.");

            // Reading from a file
            FileReader reader = new FileReader("example.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
