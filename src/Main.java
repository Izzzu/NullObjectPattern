public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Product product = warehouse.getProduct("id1");
        System.out.println(product.getState());
        product = warehouse.getProduct("bleble");
        System.out.println(product.getState());
    }
}
