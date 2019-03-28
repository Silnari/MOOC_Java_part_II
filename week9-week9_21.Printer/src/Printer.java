import java.io.File;
import java.util.Scanner;

public class Printer {
    private final File file;
    private Scanner scanner;

    public Printer(String fileName) throws Exception{
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception{
        scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.contains(word))
                System.out.println(line);
        }
        scanner.close();
    }
}
