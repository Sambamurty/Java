package exception; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A3ExceptionHanling{
    public static void main(String[] args) throws IOException, PositiveNumberException {
    	File file = new File("file.txt");
    	file.createNewFile();
    	FileWriter fos = new FileWriter("file.txt");
    	fos.write(12);
    	fos.flush();
    	fos.close();
        String filePath = "file.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());
                    if (number > 0) {
                        throw new PositiveNumberException("Positive number found s"+number);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class PositiveNumberException extends Exception {
	PositiveNumberException(String message) {
        super(message);
    }
}

