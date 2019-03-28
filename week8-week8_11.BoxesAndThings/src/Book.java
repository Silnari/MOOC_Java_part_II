public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.weight = weight;
        this.name = name;
        this.writer = writer;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }
}
