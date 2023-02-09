import java.io.Console;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserData user=new UserData();
        Catalog c = new Catalog();
        int ch;

        NewSession:
        do {
            System.out.print("\n1. Login \n2. Register \n3. Change Password\n4. Exit");
            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.print("\nEnter UserName: ");
                    String userName = sc.next();
                    String password = hiddenPassword();
                    User currUser = new User();
                    if (currUser.loginUser(user.userList, userName, password))
                    {
                        currUser = user.getUser(userName);
                        int choice;
                        do
                        {
                            System.out.print("\u000C");//for clear screen
                            c.getCatalog();
                            System.out.print("\n1.Show Profile\n2.Purchase\n3.Logout");
                            System.out.print("\nEnter your choice:");
                            choice=sc.nextInt();
                            switch(choice)
                            {
                                case 1:
                                {
                                    showProfile(currUser);
                                    break;
                                }
                                case 2:
                                {
                                    int productId;
                                    while(true) {
                                        System.out.print("\nEnter Product ID to purchase product: ");
                                        productId = sc.nextInt();
                                        if(productId>4){
                                            System.out.print("Please Enter valid productId \n");
                                        }
                                        else{
                                            break;
                                        }
                                    }
                                    Product purchasedProduct = c.getProduct(productId);
                                    System.out.print("\nSelected Product: " + purchasedProduct.productName);
                                    Transaction t = new Transaction();
                                    t.purchase(purchasedProduct, currUser, c.productList, sc);
                                    break;
                                }

                                case 3:
                                {
                                    continue NewSession;
                                }

                                default:
                                {
                                    System.out.print("Invalid choice...Enter valid choice!!\n");
                                    break;
                                }
                            }
                        }while(choice!=3);

                    }
                    else
                    {
                        continue;
                    }
                    break;
                }
                case 2: {
                     User userObj = new User();
                     userObj.register(user.userList);
                     user.userList.add(userObj);
                     break;
                }

                case 3: {
                        System.out.print("\nEnter Username to change Password: ");
                        String userName = sc.next();
                        User currUser = user.getUser(userName);
                        currUser.changePassword(sc);
                        break;
                }
                case 4: {
                        System.out.print("\nThank You For Shopping With Us! ");
                        break;
                }
                default: {
                        System.out.print("\nInvalid Choice...Enter valid choice!!");
                        break;
                }
            }
        } while (ch != 4);

    }

    private static void showProfile(User currUser) {
        System.out.print("\nUser Profile");//
        System.out.print("UserId: " + currUser.uId);
        System.out.print("\nFullName: "+currUser.f_name);
        System.out.print("\nUserName: " + currUser.u_name);
        System.out.println("\nBalance: " + currUser.balance);
        Formatter fmt =new Formatter();
        fmt.format("\n%10s %15s %15s %12s %15s","Product Id","Name","Quantity","Price","Total Amount");
        fmt.format("\n-------------------------------------------------------------------------------\n");
        for(int i = currUser.purchaseList.size()-1; i >= 0; i--){


            fmt.format("%10s", currUser.purchaseList.get(i).productID);
            fmt.format("%15s", currUser.purchaseList.get(i).productName);
            fmt.format("%15s", currUser.purchaseList.get(i).qty);
            fmt.format("%15s", currUser.purchaseList.get(i).price);
            fmt.format("%15s\n",currUser.purchaseList.get(i).qty*currUser.purchaseList.get(i).price);
        }
        fmt.format("-------------------------------------------------------------------------------\n");
        System.out.print(fmt);
    }

    public  static String hiddenPassword(){
        Console c=System.console();
        char[] passw = c.readPassword("Enter Password: ");
        for(int i=0;i<passw.length;i++){
            System.out.print("*");
        }
        String p = new String(passw);
        return p;
    }
}
