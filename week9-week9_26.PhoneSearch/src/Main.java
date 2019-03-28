import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        UserInterface ui = new UserInterface(scanner,phoneBook);
        ui.start();
    }
}
