import java.util.Scanner;

public class TextUserInterface {
    private Scanner _scanner;
    private Dictionary _dictionary;

    public TextUserInterface(Scanner scanner, Dictionary dictionary){
        _scanner = scanner;
        _dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statement:\n" +
                "add - adds a word pair to the dictionary\n" +
                "translate - asks a word and prints its translation\n" +
                "quit - quit the text user interface");
        while(true){
            System.out.print("Statement: ");
            String statement = _scanner.nextLine();
            if(statement.equals("quit")){
                System.out.print("Cheers!");
                break;
            }

            if(statement.equals("add")){
                System.out.print("In Finnish: ");
                String word = _scanner.nextLine();
                System.out.print("Translation: ");
                String translation = _scanner.nextLine();
                _dictionary.add(word,translation);
            }

            if(statement.equals("translate")){
                System.out.print("Give a word: ");
                String word = _scanner.nextLine();
                System.out.println("Translation: " + _dictionary.translate(word));
            }

            else
                System.out.println("Unknown statement");
        }
    }
}
