import java.util.*;

public class Bank {
    private String Name;
    private int Account_Number;
    private String Account_Type;
    private Double InitialAmount;

    public Bank(String Name, int Account_Number, String Account_Type, Double InitialAmount) {
        this.Name = Name;
        this.Account_Number = Account_Number;
        this.Account_Type = Account_Type;
        this.InitialAmount = InitialAmount;
    }

    public void depositBalance(double Amount) {
        double newBalance = InitialAmount + Amount;
        InitialAmount = newBalance;
    }

    public void Withdraw(double WithdrawAmounnt) {
        //if (InitialAmount > WithdrawAmounnt) {
            Double newInitialAmount = InitialAmount - WithdrawAmounnt;
            InitialAmount = newInitialAmount;
       // } else {
           // System.out.println("insufficient Balance: ");
            //System.exit(0);
        //}
    }

    public Double getInitialAmount() {
        return InitialAmount;

    }

    public Double getnewInitialAmount() {
        return InitialAmount;
    }

    // public String getDetail(String Name, int Account_Number, String Account_Type, Double initialAmount){
    //     return Name;
    //     return Account_Number;
    //     return Account_Type;
    //     return InitialAmount;
    // }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Double MainBalance = 50000.0;
        double DepositAmount;
        Double WithdrawAmount;
        Bank BA = new Bank("pradeep Dhakal", 999, "Saving Account ", MainBalance);
        while (true) {
            System.out.println("Welcome to NAbIL BANK :  ");
            System.out.println("choose D for Deposit : ");
            System.out.println("Choose W for Withdraw : ");
            System.out.println("Choose C for Check Balance : ");
            System.out.println("Choose X for exit : ");
            System.out.print("Choose Operation: ");
            char ch = SC.next().charAt(0);
            switch (ch) {
                case 'D':
                    System.out.print("Enter amount to deposited : ");
                    DepositAmount = SC.nextDouble();
                    BA.depositBalance(DepositAmount);
                    System.out.println("your money was sucessfully deposited");
                    System.out.println("Your new balance is: " + (BA.getInitialAmount()));

                    break;

                case 'W':
                    System.out.print("Enter amount to Withdeaw : ");
                    WithdrawAmount = SC.nextDouble();
                    if (MainBalance > WithdrawAmount) {
                        BA.Withdraw(WithdrawAmount);
                        System.out.println("You remaining balanec:" + (BA.getnewInitialAmount()));
                    } else {
                        System.out.println("Insufficient Balance: ");
                        System.exit(0);

                    }
                    break;

                case 'C':
                    System.out.println("Balance: " + (BA.getInitialAmount()));
                    System.out.println("");
                    break;

                case 'X':
                    System.exit(0);

                default:
                    System.out.println("please choose vallied operation: ");

            }
            // System.out.println(BA.getDetail()); 

            // System.out.println(BA.getInitialAmount());
            // System.out.println(BA.getnewInitialAmount());
        }
        
    }

}
