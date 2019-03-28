package boxes;

public class Main {

    public static void main(String[] args) {
        Box box = new OneThingBox();
        box.isInTheBox(new Thing("a"));
    }
}
