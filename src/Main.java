import java.util.ArrayList;

import java.util.Scanner;
import java.util.Formatter;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int ch;
//        do {
//            System.out.println("1. Login \n2. Register \n3. Change Password\n4. Exit");
//            ch = sc.nextInt();
//            switch (ch) {
//                case 1: {
//                    String userName = sc.nextLine();
//                    sc.nextLine();
//                    String password = sc.nextLine();
//                    sc.nextLine();
//                    User userObj = new User();
//                    if (userObj.loginUser(userName, password)) {
//                        //Go to part 2
//                    } else {
//                        continue;
//                    }
//
//                }
//                case 2: {
//                    User userObj = new User();
//                   // userObj.register();
//                }
//
//                case 3: {
//                    System.out.println("Enter Username to change Password ");
//                    String userName = sc.next();
//                    User userObj = new User();
//                    userObj.changePassword(userName);
//                }
//                default: {
//                    System.out.println("Invalid Choice");
//                }
//            }
//        } while (ch != 4);
        // testing

//        System.out.println("Hello world!");
//        Transaction t = new Transaction();
////        Product p= new Product();
//        User u = new User();
        Catalog c = new Catalog();
        c.getCatalog();

    }
}
