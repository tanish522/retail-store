import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //part 1 testing 
        ArrayList<User> userList = new ArrayList<>();
        User temp = new User();
        temp.uId = 11;
        temp.name = "jinal";
        temp.balance = 0;
        temp.password = "j";
        userList.add(temp);
        
        temp.loginUser("jinal","j@j");
        // testing
        // System.out.println("Hello world!");
        // Transaction t = new Transacti   on();
        // Product p = new Product();
        // User u = new User();
        // Catalog c = new Catalog();
        // p.productID = 1;
        // p.qty = 10;
        // p.price = 100;
//        part2:
//        {
//            System.out.println("transaction label where balance is insufficient");
//        }
      //  t.purchase(p,u);
        // display catalog


    }
}
