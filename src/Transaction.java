import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
    int totalAmount, pID, updatedBal;
    public void purchase(Product p, User u, ArrayList<Product> productList, Scanner sc) {
        System.out.println("Your Balance: " + u.balance);
        System.out.println("Enter quantity : ");
        int purchasedQty = sc.nextInt();
        totalAmount = purchasedQty * p.price;
        if (u.balance < totalAmount) {
            System.out.println("Insufficient balance");
        }
        else{
            u.balance -= totalAmount;
            p.qty -= purchasedQty;
            Product temp=new Product(p.productID,p.productName,p.price,purchasedQty);
            u.purchaseList.add(temp);
            for (int i=0;i<productList.size();i++)
            {
                if(productList.get(i).productID==p.productID)
                {
                    productList.get(i).qty=p.qty;
                }
            }
            System.out.println("Successful transaction");
        }
    }
}

