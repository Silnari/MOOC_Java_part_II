import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String input = "1\n" + "HA-LOL\n" + "42\n" +
//                "1\n" + "G-OWAC\n" + "101\n" +
//                "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n" +
//                "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" +
//                "2\n" + "HA-LOL\n" + "BAL\n" + "HEL\n" +
//                "x\n" +
//                "1\n" +
//                "2\n" +
//                "3\n" + "G-OWAC\n" +
//                "x\n";
        Scanner scanner = new Scanner(System.in);
        Departure departure = new Departure();

        TextUserInterface iu = new TextUserInterface(scanner,departure);
        iu.startAirPortPanel();
        System.out.print("\n");
        iu.startFlightService();
    }
}
//1 AY-123 108 2 AY-123 HEL TXL x x