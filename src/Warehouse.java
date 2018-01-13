import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    Map<String, Integer> products = new HashMap<>();
    {
        products.put("id1", 2);
        products.put("id2", 15);
        products.put("id3", 4);

    };

    public Product getProduct(String id) {
        if(products.containsKey(id)) {
            return new AwesomeProduct(id, products.get(id));
        }
        return new NullProduct();

    }


}
