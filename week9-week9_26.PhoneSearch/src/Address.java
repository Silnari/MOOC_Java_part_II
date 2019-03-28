import java.util.ArrayList;
import java.util.List;

public class Address {
    private String name;
    private String street;
    private String city;

    public Address(String name, String city, String street){
        this.name = name;
        this.city = city;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public List<String> getAddress(String name){
        List<String> list = new ArrayList<String>();
        list.add(city);
        list.add(street);
        return list;
    }

    @Override
    public String toString() {
        return "address: " + street + " " + city;
    }
}
