import java.util.ArrayList;
import java.util.Scanner;

public class User {

    int uId=0;
    String name ="";
    String password;
    int balance = 0;
    ArrayList<PurchaseDetail> purchaseList = new ArrayList<PurchaseDetail>();




    public boolean loginUser(String userName, String password){
        ArrayList<User> users=new ArrayList<>();
        for(int i=0;i<users.size();i++){
            User temp = users.get(i);

            if(temp.name.equals(userName) && temp.password.equals(password)){
                System.out.print("Welcome "+userName);
                return true;
            }
        }
        System.out.println("Username Or Password incorrect");
        return false;
    }
    public boolean changePassword(String userName){
        ArrayList<register> users=new ArrayList<>();
        for(int i=0;i<users.size();i++){
            register temp = users.get(i);
            if(temp.name.equals(userName)){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter New Password: ");
                temp.password = sc.next();
                users.set(i,temp);
                System.out.println("Password changed successfully ");
                sc.close();
                return true;
            }
        }
        System.out.println("Username Does not exists ");
        return false;
    }
}
class AllUsers{
    ArrayList<User>  userList = new ArrayList<>();

    void addUser(User u){
        userList.add(u);
    }

}


class PurchaseDetail {
    String pid;
    int qty;

}
