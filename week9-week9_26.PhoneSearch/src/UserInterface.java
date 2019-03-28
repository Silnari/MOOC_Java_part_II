import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private PhoneBook phoneBook;

    public UserInterface(Scanner scanner, PhoneBook phoneBook){
        this.scanner = scanner;
        this.phoneBook = phoneBook;
    }

    public void start(){
        printMenu();
        while(true){
            System.out.print("command: ");
            String response = scanner.nextLine();

            if(response.equals("1")){
                System.out.print("whose number: ");
                String name = scanner.nextLine();

                System.out.print("number: ");
                String number = scanner.nextLine();

                phoneBook.addPhone(name,number);
            }

            if(response.equals("2")){
                System.out.print("whose number: ");
                String name = scanner.nextLine();

                phoneBook.printNumber(name);
            }

            if(response.equals("3")){
                System.out.print("number: ");
                String number = scanner.nextLine();

                phoneBook.printNameByNumber(number);
            }

            if(response.equals("4")){
                System.out.print("whose address: ");
                String name = scanner.nextLine();

                System.out.print("street: ");
                String street = scanner.nextLine();

                System.out.print("city: ");
                String city = scanner.nextLine();

                phoneBook.addAddress(name,city,street);
            }

            if(response.equals("5")){
                System.out.print("whose information: ");
                String name = scanner.nextLine();

                phoneBook.printInfo(name);
            }

            if(response.equals("6")){
                System.out.print("whose information: ");
                String name = scanner.nextLine();

                phoneBook.deletePerson(name);
            }

            if(response.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String keyword = scanner.nextLine();

                phoneBook.filteredInfo(keyword);
            }

            if(response.equals("x")){
                break;
            }
            System.out.print("\n");
        }
    }

    private void printMenu(){
        System.out.print("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n" +
                "\n");
    }
}
