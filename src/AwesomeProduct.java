
public class AwesomeProduct extends Product {
    private final String id;
    private final int amount;

    public AwesomeProduct(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String getState() {
        return "There is " + amount + " products in stock.";
    }
}
