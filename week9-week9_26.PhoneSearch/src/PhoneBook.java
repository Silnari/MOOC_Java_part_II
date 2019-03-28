import java.util.*;

public class PhoneBook {
    private Map<String, Phone> phoneBook;
    private Map<String, Address> addressBook;

    public PhoneBook(){
        phoneBook = new HashMap<String, Phone>();
        addressBook = new HashMap<String, Address>();
    }

    public void addPhone(String name, String phoneNumber){
        if(!phoneBook.containsKey(name)){
            phoneBook.put(name,new Phone(name));
        }
        phoneBook.get(name).addPhoneNumber(phoneNumber);
    }

    public void addAddress(String name, String city, String street){
        addressBook.put(name, new Address(name, city, street));
    }

    public void printNumber(String name){
        if(!phoneBook.containsKey(name)){
            System.out.print("  not found\n");
            return;
        }

        for(String phoneNumber: phoneBook.get(name).getPhoneNumbers()){
            System.out.print(" " + phoneNumber + "\n");
        }
    }

    public void printNameByNumber(String number){
        for(Phone phone: phoneBook.values()){
            if(phone.containsNumber(number)){
                System.out.print(" " + phone.getName() + "\n");
                return;
            }
        }
        System.out.print("  not found\n");
    }

    public void printInfo(String name){
        if(!addressBook.containsKey(name) && !phoneBook.containsKey(name)) {
            System.out.println("  not found");
            return;
        }
        if(!addressBook.containsKey(name))
            System.out.print("  address unknown\n");
        else
            System.out.println("  " + addressBook.get(name));

        if(!phoneBook.containsKey(name))
            System.out.print("  phone number not found\n");
        else{
            System.out.print("  phone numbers:\n");
            for(String phoneNumber: phoneBook.get(name).getPhoneNumbers()){
                System.out.print("   " + phoneNumber + "\n");
            }
        }
    }

    public void deletePerson(String name){
        if(phoneBook.containsKey(name))
            phoneBook.remove(name);
        if(addressBook.containsKey(name))
            addressBook.remove(name);
    }

    private List<String> makeIntoSortedList(){
        Set<String> set = new HashSet<String>();
        for(Phone phone: phoneBook.values())
            set.add(phone.getName());
        for(Address address: addressBook.values())
            set.add(address.getName());

        List<String> names = new ArrayList<String>(set);
        Collections.sort(names);

        return names;
    }

    public void filteredInfo(String filter){
        System.out.print("\n");

        boolean printKeywordNotFound = true;

        List<String> names = makeIntoSortedList();

        for(String name: names){
            if(name.contains(filter) || (addressBook.containsKey(name) && addressBook.get(name).getAddress(name).contains(filter))){
                System.out.println(" " + name);
                printInfo(name);
                printKeywordNotFound = false;
            }
        }
        if(printKeywordNotFound)
            System.out.print(" keyword not found\n");
    }
}
