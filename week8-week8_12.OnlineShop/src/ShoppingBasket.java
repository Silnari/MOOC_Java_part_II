import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchaseMap;

    public ShoppingBasket(){
        purchaseMap = new HashMap<String, Purchase>();
    }

    public void add(String product, int price){
        if(purchaseMap.containsKey(product)){
            purchaseMap.get(product).increaseAmount();
            return;
        }
        purchaseMap.put(product,new Purchase(product,1,price));
    }

    public int price(){
        int price = 0;
        for(String purchase: purchaseMap.keySet()){
            price += purchaseMap.get(purchase).price();
        }
        return price;
    }

    public void print(){
        for(String purchase: purchaseMap.keySet()){
            System.out.println(purchaseMap.get(purchase));
        }
    }
}
