import java.util.ArrayList;
import java.util.Scanner;
public class login {
    int uId=0;
    String name ="";
    String password = "";
    int balance = 0;
    ArrayList<register> users = new ArrayList<>();
    public void registeredUser(register newUser){
        users.add(newUser);
        
    }
    public boolean loginUser(String userName, String password){
        for(int i=0;i<users.size();i++){
            register temp = users.get(i);
            if(temp.name.equals(userName) && temp.password.equals(password)){
                System.out.print("Welcome "+userName);
                return true;
            }
        }
        System.out.println("Username Or Password incorrect");
        return false;
    }
    public boolean changePassword(String userName){
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
