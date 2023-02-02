import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
<<<<<<< HEAD
    int totalAmount, pID, purchasedQty;
    Transaction purchase(Product p, User u) {
=======
    int totalAmount, pID, updatedBal;
    public void purchase(Product p, User u, ArrayList<Product> productList) {
        System.out.println("Your Balance: " + u.balance);
>>>>>>> c17533bcdd6f8dbc2489adc93da2595fedeea376
        Scanner sc = new Scanner(System.in);
        Transaction t = new Transaction();
        System.out.println("Enter required quantity : ");
        int purchasedQty = sc.nextInt();
        totalAmount = purchasedQty * p.price;
        if (u.balance < totalAmount) {
            System.out.println("Insufficient balance");
        }
        else{
            u.balance -= totalAmount;
            p.qty -= purchasedQty;
            System.out.println("Successful transaction");
<<<<<<< HEAD
            u.balance-=totalAmount;
            return t;
=======
>>>>>>> c17533bcdd6f8dbc2489adc93da2595fedeea376
        }
    }
}

