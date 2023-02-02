import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
    int totalAmount, pID, updatedBal;
    public void purchase(Product p, User u, ArrayList<Product> productList) {
        System.out.println("Your Balance: " + u.balance);
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

        }
    }
}

