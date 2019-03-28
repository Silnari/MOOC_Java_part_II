import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    private Departure departure;

    public TextUserInterface(Scanner scanner, Departure departure){
        this.departure = departure;
        this.scanner = scanner;
    }

    public void startAirPortPanel(){
        System.out.println("Airport panel\n" +
                "--------------------\n");

        while(true){
            System.out.print("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit\n" +
                    "> ");
            String response = scanner.nextLine();

            if(response.equals("1")){
                System.out.print("Give plane ID: ");
                String ID = scanner.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                departure.addPlane(ID,capacity);
            }

            if(response.equals("2")){
                System.out.print("Give plane ID: ");
                String ID = scanner.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = scanner.nextLine();
                System.out.print("Give destination airport code: ");
                String destination = scanner.nextLine();
                this.departure.addFlight(ID,departure,destination);
            }

            if(response.equals("x"))
                break;
        }
    }

    public void startFlightService(){
        System.out.println("Flight service\n" +
                "------------\n");

        while(true){
            System.out.print("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit\n" +
                    "> ");
            String response = scanner.nextLine();

            if(response.equals("1")){
                departure.printPlanes();
            }

            if(response.equals("2")){
                departure.printFlights();
                System.out.print("\n");

            }

            if(response.equals("3")){
                System.out.print("Give plane ID: ");
                String ID = scanner.nextLine();
                departure.printPlane(ID);
                System.out.print("\n");
            }

            if(response.equals("x"))
                break;
        }
    }
}
