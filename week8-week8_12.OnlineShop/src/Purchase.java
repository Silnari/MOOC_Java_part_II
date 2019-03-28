public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPirce){
        this.amount = amount;
        this.product = product;
        this.unitPrice = unitPirce;
    }

    public int price(){
        return unitPrice*amount;
    }

    public void increaseAmount(){
        amount++;
    }

    @Override
    public String toString() {
        return product + ": " + amount;
    }
}
