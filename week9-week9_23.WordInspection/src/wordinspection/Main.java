package wordinspection;

import java.io.File;


public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/wordList.txt");

        WordInspection wordInspection = new WordInspection(file);
        System.out.println(wordInspection.wordsEndingInL());
        System.out.print("----------\n");

        System.out.println(wordInspection.wordsContainingZ());
        System.out.print("----------\n");

        System.out.println(wordInspection.wordCount());
        System.out.print("----------\n");

        System.out.println(wordInspection.palindromes());
        System.out.print("----------\n");

        System.out.println(wordInspection.wordsWhichContainAllVowels());

    }
}
