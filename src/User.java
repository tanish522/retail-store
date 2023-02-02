import java.util.ArrayList;
import java.util.Scanner;

public class User {

    int uId;
    String name;
    String password;
    int balance;
    ArrayList<Product> purchaseList = new ArrayList<>();

    User(int id,String name,String password,int bal)
    {
        this.uId=id;
        this.name=name;
        this.password=password;
        this.balance=bal;
    }
    public User()
    {

    }

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

    public void changePassword(ArrayList<User> userList, String userName){
        System.out.println("size "+userList.size());
        for(int i=0;i<userList.size();i++){
            User temp = userList.get(i);
            if(temp.name.equals(userName)){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter New Password: ");
                temp.password = sc.next();
                userList.set(i,temp);
                System.out.println("Password changed successfully ");
                return;
            }
        }
        System.out.println("Username Does not exists ");
    }
}
class UserData
{
    ArrayList<User> userList = new ArrayList<>();

    public UserData()
    {
        userList.add(new User(1,"neel","neel",25000));
        userList.add(new User(2,"pratish","pratish",20000));
        userList.add(new User(3,"jinal","jinal",3000));
        userList.add(new User(4,"tanish","tanish",200));
    }
    public User getUser(String name)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).name.equals(name))
            {
                return userList.get(i);
            }
        }
        return null;
    }
}
