
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File fileToOpen = new File(file);
        Scanner scanner = new Scanner(fileToOpen);
        List<String> content = new ArrayList<String>();

        while(scanner.hasNextLine()){
            content.add(scanner.nextLine());
        }

        return content;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);

        writer.write(text + '\n');

        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);

        for(String text: texts)
            writer.write(text + '\n');

        writer.close();
    }
}
