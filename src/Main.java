import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserData user=new UserData();
        Catalog c = new Catalog();
        int ch = 0;

        NewSession:
        do {
            System.out.println("1. Login \n2. Register \n3. Change Password\n4. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter UserName: ");
                    String userName = sc.next();
                    System.out.println("Enter Password: ");
                    String password = sc.next();
                    User currUser = new User();
                    if (currUser.loginUser(user.userList, userName, password))
                    {
                        currUser = user.getUser(userName);
                        int choice;
                        do
                        {
                            c.getCatalog();
                            System.out.println("1. Show Profile\n2.Purchase\n3.Logout");
                            System.out.println("Enter your choice:");
                            choice=sc.nextInt();
                            switch(choice)
                            {
                                case 1:
                                {
                                    System.out.println("User Profile\n");//
                                    System.out.println("Id: " + currUser.uId);
                                    System.out.println("Name: " + currUser.name);
                                    System.out.println("Balance: " + currUser.balance);
                                    for(int i = currUser.purchaseList.size()-1; i >= 0; i--){
                                        System.out.println("Name: "+currUser.purchaseList.get(i).productName);
                                        System.out.print(" Product Id: "+currUser.purchaseList.get(i).productID);
                                        System.out.print(" Quantity: "+currUser.purchaseList.get(i).qty);
                                        System.out.print(" Price: "+currUser.purchaseList.get(i).price);
                                        System.out.println();
                                    }
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Enter Product ID to purchase: ");
                                    int productId = sc.nextInt();
                                    Product purchasedProduct = c.getProduct(productId);
                                    System.out.println("Selected Product: " + purchasedProduct.productName);
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
                                    System.out.println("Invalid choice...Enter valid choice!!\n");
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
                        System.out.println("Enter Username to change Password ");
                        String userName = sc.next();
                        User currUser = user.getUser(userName);
                        currUser.changePassword(sc);
                        break;
                }
                case 4: {
                        System.out.println("Thank You For Shopping With Us! ");
                        break;
                }
                default: {
                        System.out.println("Invalid Choice...Enter valid choice!!");
                        break;
                }
            }
        } while (ch != 4);

    }
}
