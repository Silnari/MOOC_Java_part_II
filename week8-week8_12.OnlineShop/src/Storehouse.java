import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> store;
    private Map<String, Integer> stocks;

    public Storehouse(){
        store = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        store.put(product,price);
        stocks.put(product,stock);
    }

    public int price(String product){
        if(!store.containsKey(product))
            return -99;
        return store.get(product);
    }

    public int stock(String product){
        if(!stocks.containsKey(product))
            return 0;
        return stocks.get(product);
    }

    public boolean take(String product){
        if(!stocks.containsKey(product))
            return false;

        if(stocks.get(product) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products(){
        Set<String> set = new HashSet<String>();
        for(String product: store.keySet())
            set.add(product);
        return set;
    }
}
