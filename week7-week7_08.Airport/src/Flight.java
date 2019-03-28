public class Flight {
    private Plane _plane;
    private String _departure;
    private String _destination;

    public Flight(Plane plane, String departure, String destination){
        _plane = plane;
        _departure = departure;
        _destination = destination;
    }

    @Override
    public String toString() {
        return _plane + " (" + _departure + "-" + _destination + ")";
    }
}
