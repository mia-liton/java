import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "//home/liton/test.txt";
        String textContent = "I like pizza!\nIt's really good\nBuy me pizza";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch (IOException e) {
            System.out.println("Could not write file");

        }

    }

}