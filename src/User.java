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

    public void register(ArrayList<User> uList){
        Scanner sc = new Scanner(System.in);
        RegisterAgain:
        while (true)
        {
            System.out.println("Enter UID: ");
            this.uId = sc.nextInt();
            System.out.println("Enter Name: ");
            this.name = sc.next();
            for (int i = 0; i < uList.size(); i++) {
                if (this.uId == uList.get(i).uId || this.name.equals(uList.get(i).name)) {
                    System.out.println("User already exists. Enter another user ID and user name ");
                    continue RegisterAgain;
                }
            }
            break;
        }
        System.out.println("Enter Password: ");
        this.password = sc.next();
        System.out.println("Enter Balance: ");
        this.balance = sc.nextInt();
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

    public void changePassword(Scanner sc){

        System.out.println("Enter New Password: ");
        this.password=sc.next();
        System.out.println("Password changed successfully ");
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
