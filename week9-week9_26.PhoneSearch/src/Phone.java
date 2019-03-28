import java.util.ArrayList;
import java.util.List;

public class Phone {
    private List<String> phoneNumbers;
    private String name;

    public Phone(String name){
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void addPhoneNumber(String phoneNumber){
        phoneNumbers.add(phoneNumber);
    }

    public boolean containsNumber(String number){
        if(phoneNumbers.contains(number))
            return true;
        return false;
    }
}
