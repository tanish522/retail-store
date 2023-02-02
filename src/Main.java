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
                        c.getCatalog();
                        System.out.println("1. Show Profile\n2.Purchase\n3.Logout");
                        System.out.println("Enter your choice:");
                        int choice=sc.nextInt();
                        switch(choice)
                        {
                            case 1:
                            {
                                System.out.println("Show Profile\n");//
                                System.out.println("Id: " + currUser.uId);
                                System.out.println("Name: " + currUser.name);
                                System.out.println("Balance: " + currUser.balance);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Enter Product ID to purchase: ");
                                int productId = sc.nextInt();
                                Product purchasedProduct = c.getProduct(productId);
                                System.out.println(purchasedProduct.productName);
                                Transaction t = new Transaction();
                                t.purchase(purchasedProduct, currUser, c.productList);
                                //purchasedProduct.updateQuantity(t);
                                break;
                            }

                            case 3:
                            {
                                continue NewSession;
                            }

                            default:
                            {
                                System.out.println("Invalid choice...Enter proper choice\n");
                                break;
                            }
                        }
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
                        User userObj = new User();
                        userObj.changePassword(user.userList, userName);
                        break;
                }
                case 4: {
                        System.out.println("Thank You For Shopping With Us! ");
                        break;
                }
                default: {
                        System.out.println("Invalid Choice");
                        break;
                }
            }
        } while (ch != 4);

    }
}
