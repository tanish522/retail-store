import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {

    static ArrayList<User> userList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("1. Login \n2. Register \n3. Change Password\n4. Exit");

            try{
                 ch = sc.nextInt();
            }catch (NoSuchElementException s){
                System.out.println("error");
                System.out.println(s.toString());
                System.out.println("Enter choice :");
                ch = sc.nextInt();
            }
            switch (ch) {
                case 1: {
                    System.out.println("Enter UserName: ");
                    String userName = sc.next();
                    System.out.println("Enter Password: ");
                    String password = sc.next();
                    User userObj = new User();
                    if (userObj.loginUser(userList, userName, password)) {
                        //Go to part 2
                    } else {
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
                    try{
                        System.out.println("Enter Username to change Password ");
                        String userName = sc.next();
                        User userObj = new User();
                       int index = userObj.changePassword(userList, userName);
                        System.out.println("From Main" + userList.get(index).uId + userList.get(index).password +  userList.get(index).name + userList.get(index).balance);

                    }
                    catch (Exception e) {
                        System.out.println(e.toString());
                    }
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
        // testing

        System.out.println("Hello world!");
        Transaction t = new Transaction();
//        Product p= new Product();
        User u = new User();
        Catalog c = new Catalog();

    }
}
