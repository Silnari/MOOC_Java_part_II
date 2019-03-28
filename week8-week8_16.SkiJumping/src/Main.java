import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSkoczkow listaSkoczkow = new ListaSkoczkow();

        UserInterface ui = new UserInterface(scanner,listaSkoczkow);
        ui.start();
    }
}
