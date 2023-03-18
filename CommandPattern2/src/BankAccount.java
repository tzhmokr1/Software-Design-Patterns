
public class BankAccount {
	private int balance;
	private final int overdraftLimit = -1000;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Einzahlung über " + amount + " erfolgreich! Neuer Kontostand: " + 
				balance + " Euro");
	}
	
	public void withdraw(int amount) {
		if(balance - amount >= overdraftLimit) {
			balance -= amount;
			System.out.println("Auszahlung über " + amount + " erfolgreich! Neuer Kontostand: " + 
						balance + " Euro");
		}
		else {
			System.out.println("Leider ist nicht genug Geld auf dem Konto!");
		}
	}

	@Override
	public String toString() {
		return "[balance=" + balance + ", overdraftLimit=" + overdraftLimit + "]";
	}
	
	
}
