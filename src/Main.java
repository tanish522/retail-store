import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // testing
        System.out.println("Hello world!");
        Transaction t = new Transaction();
//        Product p= new Product();
        User u = new User();
        Catalog c = new Catalog();
        Product book = new Product(1,"Book",200,4);
        Product bag = new Product(2,"Bag",400,1);
        Product pen = new Product(3,"Pen",25,10);
        Product bottle = new Product(4,"Bottle",25,2);

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

        //display products
        //book.display();


    }
}
