package containers;

public class ProductContainer extends Container{
    private String name;

    public ProductContainer(String productName, double capacity){
        super(capacity);
        name = productName;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + super.toString();
    }
}
