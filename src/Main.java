import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // testing
        System.out.println("Hello world!");
        Transaction t = new Transaction();
//        Product p= new Product();
        User u = new User();
        Catalog c = new Catalog();

//        p.productID = 1;
//        p.qty = 10;
//        p.price = 100;
//        part2:
//        {
//            System.out.println("transaction label where balance is insufficient");
//        }
        //t.purchase(book,u);
        // set catalog
        c.setProductList(book);
        c.setProductList(bag);
        c.setProductList(pen);
        c.setProductList(bottle);

        //display catalogue
        c.getCatalog();
    }
}
