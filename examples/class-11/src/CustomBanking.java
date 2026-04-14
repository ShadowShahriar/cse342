class CustomExp extends Exception {
	CustomExp(String s) {
		super(s);
	}
}

class BankAccount {
	int amount;

	BankAccount() {
		amount = 0;
	}

	BankAccount(int a) {
		amount = a;
	}

	void deposit(int a) {
		amount += a;
	}

	void withdraw(int a) throws CustomExp {
		if(amount < a || (amount - a) < 0)
			throw new CustomExp("Insufficient Funds.");
		else
			amount -= a;
	}
}

public class CustomBanking {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000);
		acc.deposit(1000);

		try{
			acc.withdraw(3000);
		} catch (CustomExp e) {
			System.out.println(e.getMessage());
		}
	}
}
