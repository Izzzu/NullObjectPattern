
public class NullProduct extends Product {
    @Override
    public String getState() {
        return "This product is not available";
    }
}
