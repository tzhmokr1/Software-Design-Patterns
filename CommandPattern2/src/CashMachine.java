
public class CashMachine {
	
	public void executeBankTransaction(BankTransactionCommand command) {
		command.execute();
	}
}
