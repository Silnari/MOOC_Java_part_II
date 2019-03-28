import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ListaSkoczkow listaSkoczkow;

    public UserInterface(Scanner scanner, ListaSkoczkow listaSkoczkow){
        this.listaSkoczkow = listaSkoczkow;
        this.scanner = scanner;
    }

    public void start(){
        System.out.print("Kumpula ski jumping week\n" +
                "\n" +
                "Write the names of the participants one at a time; an empty string brings you to the jumping phase.\n");

        while (true){
            System.out.print("  Participant name: ");
            String response = scanner.nextLine();

            if(response.equals(""))
                break;

            listaSkoczkow.add(response);
        }

        System.out.print("\n" +
                "The tournament begins!\n" +
                "\n");

        int i = 1;
        while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String response = scanner.nextLine();

            System.out.print("\n");

            if(!response.equals("jump"))
                break;
            System.out.print("Round " + i + "\n\n" +
                    "Jumping order:\n");
            listaSkoczkow.printInOrder();
            System.out.print("\n");

            listaSkoczkow.jump();

            System.out.print("Results of round " + i + "\n");
            listaSkoczkow.printPlayersResults();

            System.out.print("\n");

            i++;
        }

        System.out.print("\n" +
                "Thanks!\n" +
                "\n");
        listaSkoczkow.printResults();
    }
}
