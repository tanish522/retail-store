public class Main {

    public static void main(String[] args) {
        // testing
        System.out.println("Hello world!");
        Transaction t = new Transaction();
        Product p = new Product();
        User u = new User();
        Catalog c = new Catalog();
        p.productID = 1;
        p.qty = 10;
        p.price = 100;
//        part2:
//        {
//            System.out.println("transaction label where balance is insufficient");
//        }
        t.purchase(p,u);
        // display catalog
    }
}
