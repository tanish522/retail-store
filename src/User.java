import java.util.ArrayList;
import java.util.Scanner;


public class User {
    //adding full name = f_name and name = u_name

    int uId;
    String f_name;
    String u_name;
    String password;
    int balance;
    ArrayList<Product> purchaseList = new ArrayList<>();

    User(int id, String f_name, String u_name,String password, int bal)
    {
        this.uId=id;
        this.f_name = f_name;
        this.u_name=u_name;
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
            sc.nextLine();
            System.out.println("Enter FullName: ");
            this.f_name=sc.nextLine();
            System.out.println("Enter UserName: ");
            this.u_name = sc.nextLine();
            for (int i = 0; i < uList.size(); i++) {
                if (this.uId == uList.get(i).uId || this.u_name.equals(uList.get(i).u_name)) {
                    System.out.println("User already exists. Enter another user ID and user name ");
                    continue RegisterAgain;
                }
            }
            break;
        }
        System.out.println("Create Password: ");
        this.password = sc.next();
        System.out.println("Enter Balance: ");
        this.balance = sc.nextInt();
    }


    public boolean loginUser(ArrayList<User> userList, String userName, String password){

        for(int i=0;i<userList.size();i++){
            User temp = userList.get(i);
            if(temp.u_name.equals(userName) && temp.password.equals(password)){
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
        userList.add(new User(1,"Neel Shah","neel","neel123", 25000));
        userList.add(new User(2,"Partish Soni","Pratish","p111",200000));
        userList.add(new User(3,"Jinal Thakor","jinal","j111",3000));
        userList.add(new User(4,"Tanish Patel","tanish","t111",200));
    }
    public User getUser(String name)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).u_name.equals(name))
            {
                return userList.get(i);
            }
        }
        return null;
    }
}
