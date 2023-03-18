
public class Demo {

	public static void main(String[] args) {
		
		BankAccount hendrikBA = new BankAccount();
		System.out.println("Bankkonto erfolgreich eröffnet: " + hendrikBA);

		CashMachine cashMachineSC = new CashMachine();
		
		BankTransactionCommand command1 = new DepositCommand(hendrikBA, 2000);
		BankTransactionCommand command2 = new WithdrawCommand(hendrikBA, 5000);
		BankTransactionCommand command3 = new DepositCommand(hendrikBA, 1000);
		
		cashMachineSC.executeBankTransaction(command1);
		cashMachineSC.executeBankTransaction(command2);
		cashMachineSC.executeBankTransaction(command3);
		
		cashMachineSC.undoBankTransaction(command3);
		cashMachineSC.undoBankTransaction(command2);
		cashMachineSC.undoBankTransaction(command1);


	}

}
