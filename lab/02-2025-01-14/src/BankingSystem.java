class BankAccount{
    private int accountNumber;
    private double balance = 500.0;

    BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    void depositMoney(double amount){
        balance += amount;
    }

    void withdrawMoney(double amount){
        if(amount > balance || (balance - amount) < 500)
            System.out.println("Cannot withdraw money from A/C "+ accountNumber +": Insufficient funds");
        else
            balance -= amount;
    }

    void displayInformation(){
        System.out.println("Account no.: " + accountNumber + "\nBalance: " + balance + "\n");
    }
}

class Customer{
    private String name;
    private int customerID;
    private int activeAccounts = 0;
    BankAccount[] bankAccount = new BankAccount[50];

    Customer(String name, int customerID){
        this.name = name;
        this.customerID = customerID;
    }

    void addAccount(){
        bankAccount[activeAccounts] = new BankAccount(activeAccounts);
        activeAccounts++;
    }

    void depositTo(int accountNumber, double amount){
        bankAccount[accountNumber].depositMoney(amount);
    }

    void withdrawFrom(int accountNumber, double amount){
        bankAccount[accountNumber].withdrawMoney(amount);
    }

    void displayAccountInfo(int accountNumber){
        System.out.println("Customer name: " + name);
        System.out.println("Customer ID: " + customerID);
        bankAccount[accountNumber].displayInformation();
    }
}

public class BankingSystem {
    public static void main(String[] args){
        Customer C1 = new Customer("Shayan", 408);
        C1.addAccount();
        C1.addAccount();

        C1.depositTo(0, 2500);
        C1.displayAccountInfo(0);

        C1.depositTo(1, 11200);
        C1.displayAccountInfo(1);

        C1.withdrawFrom(1, 11200);
        C1.displayAccountInfo(1);
    }
}
