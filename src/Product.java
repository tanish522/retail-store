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
        System.out.print("\nProduct ID: "+ productID);
        System.out.print("\nProduct Name: "+ productName);
        System.out.print("\nProduct Price: "+ price);
        System.out.print("\nProduct Quantity: "+ qty);
    }
}

class Catalog {
    ArrayList<Product> productList = new ArrayList<Product>();
    // make display fun of catalog and access using its object

    public Catalog(){
        productList.add(new Product(1,"TV",60000,40));
        productList.add(new Product(2,"Laptop",100000,10));
        productList.add(new Product(3,"Phone",20000,50));
        productList.add(new Product(4,"AC",40000,20));
    }
    public void getCatalog()
    {
        Formatter fmt = new Formatter();
        fmt.format("---------------------Product Stock---------------------\n");
        fmt.format("%s %15s %15s %15s\n", "Id", "Name", "Price", "Quantity");
        fmt.format("-------------------------------------------------------\n");
        for(int i=0;i<productList.size();i++)
        {
            fmt.format("%s %15s", productList.get(i).productID,productList.get(i).productName );
            fmt.format("%15s %15s \n",productList.get(i).price, productList.get(i).qty);
        }
        System.out.print(fmt);

    }
    public void setProductList(Product product)
    {
        productList.add(product);
    }
    public Product getProduct(int id){
        for (int i = 0; i<productList.size(); i++){
            if(productList.get(i).productID == id){
                return productList.get(i);
            }
        }
        return null;
    }
}



