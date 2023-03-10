import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
    int totalAmount, pID, updatedBal;
    public void purchase(Product p, User u, ArrayList<Product> productList, Scanner sc) {
        int purchasedQty;
        System.out.print("\nYour Balance: " + u.balance);
        while(true) {
            System.out.print("\nEnter quantity : ");
            purchasedQty = sc.nextInt();
            if (purchasedQty <= 0) {
                System.out.println("Enter valid positive quantity. ");
            }
            else if (purchasedQty > p.qty) {
                System.out.print("\nQuantity not available. Enter lesser quantity. ");
            }
            else{
                break;
            }
        }
        totalAmount = purchasedQty * p.price;
        if (u.balance < totalAmount) {
            System.out.print("\nInsufficient balance");
        }
        else{
            u.balance -= totalAmount;
            //u.purchaseList.add(p);
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
            System.out.print("\nSuccessful transaction");
        }
    }
}

