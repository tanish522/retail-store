import java.util.ArrayList;

public class User {

    String username, fullName, password;
    int balance;
    ArrayList<PurchaseDetail> purchaseList = new ArrayList<PurchaseDetail>();

}

class PurchaseDetail {
    String pid;
    int qty;

}
