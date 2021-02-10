

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance = amount + balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }

    public int transferTo(int amount, Account another){
        
        if(amount<=balance){
          this.balance-=amount;
          another.balance+= amount;
        }
        else{
              System.out.println("Amount exceeded");
        }
    
    return balance;

    }

    public String toString() {
        return "Account[id: " + id + ", Name: " + name + ", Balance: " + balance + "]";
    }

    public static void main(String[] args) {

        Account ac1 = new Account("1000","Pradeep dhakal");
        Account ac2 = new Account("985268", "prabin dhaal", 5000);
        System.out.println(ac1.toString());

        ac1.credit(2000);
        System.out.println(ac1);

        ac1.debit(3000);
        System.out.println(ac1);

        ac1.transferTo(4000, ac2);
        System.out.println(ac2.toString());
       
    }

}
