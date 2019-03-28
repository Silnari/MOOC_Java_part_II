
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        Bird compared = (Bird) obj;

        if(this.ringingYear != compared.ringingYear)
            return false;

        if(!this.latinName.equals(compared.latinName))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        if(this.latinName == null)
            return 7;
        return this.ringingYear + this.latinName.hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


