import java.util.ArrayList;
public class register {
    int uId=0;
    String name ="";
    String password = "";
    int balance = 0;
    ArrayList<register> users = new ArrayList<>();
    register(int uId, String name, String password, int balance){
        //users.contains(this.uId);
        this.uId = uId;
        this.name = name;
        this.password = password;
        this.balance = balance;
        login temp = new login();
        temp.registeredUser(this);
    }
    public void loginUser(String string, String string2) {

    }

    
}
