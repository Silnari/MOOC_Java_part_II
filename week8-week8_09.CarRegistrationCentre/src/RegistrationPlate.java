
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getRegCode() {
        return regCode;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        RegistrationPlate compared = (RegistrationPlate) obj;

        if(regCode == null || !regCode.equals(compared.getRegCode()))
            return false;

        if(country == null || !country.equals(compared.getCountry()))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        if(this.regCode == null){
            return 7;
        }
        return country.hashCode() + regCode.hashCode();
    }
}
