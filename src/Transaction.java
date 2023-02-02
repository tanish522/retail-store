import java.util.Scanner;

public class Transaction {
    int totalAmount, pID, purchasedQty;
    Transaction purchase(Product p, User u) {
        Scanner sc = new Scanner(System.in);
        Transaction t = new Transaction();
        System.out.println("Enter required quantity : ");
        t.purchasedQty = sc.nextInt();
        totalAmount = t.purchasedQty * p.price;
        if (u.balance < totalAmount) {
            System.out.println("Insufficient balance");
            return null;
        }
        else{
            System.out.println("Successful transaction");
            u.balance-=totalAmount;
            return t;
        }
    }
}

