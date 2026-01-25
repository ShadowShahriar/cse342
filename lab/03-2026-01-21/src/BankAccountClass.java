class BankAccount {
    int amount = 100;
    BankAccount(int amount){
        if(amount > 100){
            this.amount = amount;
        }
    }

    void deposit(int amount){
        if(amount > 0){
            this.amount += amount;
            System.out.println("Deposit successful.");
        }else{
            System.out.println("Negative number.");
        }
    }

    void withdraw(){

    }

    void display(){
        System.out.println("Current deposit: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int amount){
        super(amount);
    }

    void withdraw(int amount){
        if(amount > this.amount || this.amount - amount < 100){
            System.out.println("Insufficient funds.");
        }else{
            this.amount -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class BankAccountClass {
    public static void main(String[] args) {
        SavingsAccount sac = new SavingsAccount(1200);
        sac.deposit(300);
        sac.withdraw(400);
        sac.display();
        sac.withdraw(2000);
        sac.display();
    }
}
