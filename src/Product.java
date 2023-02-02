import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;
public class Product {
    int productID, price, qty;
    String productName;

    Product(int productID,String productName, int price, int qty)
    {
        this.productID=productID;
        this.price=price;
        this.qty=qty;
        this.productName=productName;

    }
    void display()
    {
        System.out.println("Product ID: "+ productID);
        System.out.println("Product Name: "+ productName);
        System.out.println("Product Price: "+ price);
        System.out.println("Product Quantity: "+ qty);
    }

}

class Catalog {
    ArrayList<Product> productList = new ArrayList<Product>();
    // make display fun of catalog and access using its object

    public Catalog(){
        productList.add(new Product(1,"Book",200,4));
        productList.add(new Product(2,"Bag",400,1));
        productList.add(new Product(3,"Pen",25,10));
        productList.add(new Product(4,"Bottle",25,2));
    }
    public void getCatalog()
    {
        Formatter fmt = new Formatter();
        fmt.format("%s %15s %15s %15s\n", "Id", "Name", "Price", "Quantity");
        fmt.format("--------------------------------------------------------------\n");
        for(int i=0;i<productList.size();i++)
        {
            fmt.format("%s %15s", productList.get(i).productID,productList.get(i).productName );
            fmt.format("%15s %15s \n",productList.get(i).price, productList.get(i).qty);
//            System.out.print(productList.get(i).productID + "\t");
//            System.out.print(productList.get(i).productName + "\t");
//            System.out.print(productList.get(i).price + "\t");
//            System.out.print(productList.get(i).qty + "\n");
        }
        System.out.println(fmt);

    }


    public void setProductList(Product product)
    {
        productList.add(product);
    }
}



