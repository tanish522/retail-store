import java.util.ArrayList;
import java.util.Scanner;

public class User {

    int uId;
    String name;
    String password;
    int balance;
    ArrayList<PurchaseDetail> purchaseList = new ArrayList<PurchaseDetail>();

    public void register(){
        //users.contains(this.uId);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UID: ");
        this.uId = sc.nextInt();
        System.out.println("Enter Name: ");
        this.name = sc.next();
        System.out.println("Enter Password: ");
        this.password = sc.next();
        System.out.println("Enter Balance: ");
        this.balance = sc.nextInt();
        return;
    }


    public boolean loginUser(ArrayList<User> userList, String userName, String password){
        for(int i=0;i<userList.size();i++){
            User temp = userList.get(i);

            if(temp.name.equals(userName) && temp.password.equals(password)){
                System.out.println("Welcome "+userName);
                return true;
            }
        }
        System.out.println("Username Or Password incorrect");
        return false;
    }
    public int changePassword(ArrayList<User> userList, String userName){
        for(int i=0;i<userList.size();i++){
            User temp = userList.get(i);
            if(temp.name.equals(userName)){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter New Password: ");
                temp.password = sc.next();
                userList.set(i,temp);
                System.out.println("Password changed successfully ");
                sc.close();
                System.out.println(temp.uId + temp.password +  temp.name + temp.balance);
                return i;
            }
        }
        System.out.println("Username Does not exists ");
        return -1;
    }
}

class PurchaseDetail {
    String pid;
    int qty;

}
