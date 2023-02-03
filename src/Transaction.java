import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
    int totalAmount, pID, updatedBal;
    public void purchase(Product p, User u, ArrayList<Product> productList, Scanner sc) {
        int purchasedQty;
        System.out.println("Your Balance: " + u.balance);
        do {
            System.out.println("Enter quantity : ");
            purchasedQty = sc.nextInt();
            if(purchasedQty > p.qty)
                System.out.println("Quantity not available. Enter correct quantity. ");
        }while (purchasedQty > p.qty);

        totalAmount = purchasedQty * p.price;
        if (u.balance < totalAmount) {
            System.out.println("Insufficient balance");
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
            System.out.println("Successful transaction");
        }
    }
}

