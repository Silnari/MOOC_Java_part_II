package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private final File file;

    public WordInspection(File file){
        this.file = file;
    }

    public int wordCount(){
        Scanner reader = readFile();
        int howManyWords = 0;
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            howManyWords++;
        }
        return howManyWords;
    }

    public List<String> wordsContainingZ(){
        Scanner reader = readFile();
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.contains("z"))
                list.add(word);
        }
        return list;
    }

    public List<String> wordsEndingInL(){
        Scanner reader = readFile();
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.endsWith("l"))
                list.add(word);
        }
        return list;
    }

    public List<String> palindromes(){
        Scanner reader = readFile();
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.equals(new StringBuffer(word).reverse().toString()))
                list.add(word);
        }
        return list;
    }

    public List<String> wordsWhichContainAllVowels(){
        Scanner reader = readFile();
        List<String> list = new ArrayList<String>();
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            if(s.contains("a") && s.contains("e") && s.contains("i")
                    && s.contains("o") && s.contains("u") && s.contains("y")
                    && s.contains("ä") && s.contains("ö"))
                list.add(s);
        }
        return list;
    }

    private Scanner readFile(){
        try{
            Scanner reader = new Scanner(file, "UTF-8");
            return reader;
        } catch (FileNotFoundException ex){
            return null;
        }
    }
}
