import java.util.ArrayList;
import java.util.HashMap;

public class Departure {
    private HashMap<String,Plane> planes;
    private ArrayList<Flight> flights;

    public Departure(){
        planes = new HashMap<String, Plane>();
        flights = new ArrayList<Flight>();
    }

    public void printPlane(String ID){
        if(planes.containsKey(ID)){
            System.out.println(planes.get(ID));
        }
    }

    public void printFlights(){
        for(Flight flight: flights)
            System.out.println(flight);
    }

    public void printPlanes(){
        for(String plane: planes.keySet()){
            System.out.println(planes.get(plane));
        }
    }

    public void addPlane(String ID, int capacity){
        planes.put(ID,new Plane(ID,capacity));
    }

    public void addFlight(String ID, String departure, String destination){
        if(planes.containsKey(ID)){
            flights.add(new Flight(planes.get(ID),departure,destination));
        }
    }
}
