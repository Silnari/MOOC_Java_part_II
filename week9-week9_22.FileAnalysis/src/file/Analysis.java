package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    private final File file;

    public Analysis(File file){
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int howManyLines = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            howManyLines++;
        }
        scanner.close();
        return howManyLines;
    }

    public int characters() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int howManyCharacters = 0;
        while(scanner.hasNextLine()){
            String s = scanner.useDelimiter("").nextLine();
            howManyCharacters += s.length() + 1;
        }
        return howManyCharacters;
    }
}
