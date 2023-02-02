import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<User> userList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalog c = new Catalog();
        int ch = 0;
        do {

            System.out.println("1. Login \n2. Register \n3. Change Password\n4. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter UserName: ");
                    String userName = sc.next();
                    System.out.println("Enter Password: ");
                    String password = sc.next();
                    User userObj = new User();
                    if (userObj.loginUser(userList, userName, password))
                    {
                        c.getCatalog();
                        System.out.println("1. Show Profile\n2.Purchase\n3.Logout");
                        System.out.println("Enter your choice:");
                        int choice=sc.nextInt();
                        switch(choice)
                        {
                            case 1:{
                                break;
                            }

                            case 2:
                            {
                                break;
                            }

                            case 3:
                            {
                                break;
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
                     userObj.register();
                     userList.add(userObj);
                     break;
                }

                case 3: {
                        System.out.println("Enter Username to change Password ");
                        String userName = sc.next();
                        User userObj = new User();
                        userObj.changePassword(userList, userName);
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
