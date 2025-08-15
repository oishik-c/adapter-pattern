import com.example.bank.*;

public class BankTest {
    public static void main(String[] args) {
//        Instantiating a new account with axis bank
        Axis AxisAccount = new Axis("Rahul", "12345678", 150000.00);
//        Printing the details with this account
        System.out.println("Old Details With Axis Bank:");
        AxisAccount.printDetails();

//        Changing Name and Balance
        AxisAccount.setAccBalance(100000.00);
        AxisAccount.setAccName("Gukesh");

//        Printing new details
        System.out.println("\nNew Details With Axis Bank:");
        AxisAccount.printDetails();

//        Creating a new HDFC account using the Axis Bank account
        Bank2 HDFCaccount = new AxisToHDFC(AxisAccount);

//        Printing details of HDFC account
        System.out.println("\nOld Details with HDFC Bank: ");
        HDFCaccount.printInfo();

//        Changing Account Number
        HDFCaccount.setNumber("11111111");

        System.out.println("\nNew Details with HDFC Bank: ");
        HDFCaccount.printInfo();

//        Checking Axis Bank Account
        System.out.println("\nTesting Axis account: ");
        AxisAccount.printDetails();
    }
}