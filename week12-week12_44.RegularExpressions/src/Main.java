import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = scanner.nextLine();

        if(allVowels(string))
            System.out.println("The form is fine.");
        else
            System.out.println("The form is wrong.");
    }

    public static boolean isAWeekDay(String string){
        if (string.matches("(mon|tue|wed|thu|fri|sat|sun)")) {
            return true;
        }
        return false;
    }

    public static boolean allVowels(String string){
        if(string.matches("[aeoiuyöä]+"))
            return true;
        return false;
    }

    public static boolean clockTime(String string){
        try{
            String subStrings[] = string.split(":");

            if(!subStrings[0].matches("[01][0-9]") && !subStrings[0].matches("2[0-3]"))
                return false;

            if(!subStrings[1].matches("[0-5][0-9]"))
                return false;

            if(!subStrings[2].matches("[0-5][0-9]"))
                return false;

            return true;
        } catch (Exception e){
            return false;
        }
    }
}
