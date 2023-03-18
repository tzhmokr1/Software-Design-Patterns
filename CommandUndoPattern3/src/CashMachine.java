import java.util.ArrayList;
import java.util.List;

public class CashMachine {
	private List<BankTransactionCommand> commands = new ArrayList<BankTransactionCommand>();
	
	public void executeBankTransaction(BankTransactionCommand command) {
		command.execute();
		commands.add(command);
	}
	
	public void undoBankTransaction(BankTransactionCommand command) {
		command.undo();
	}
}
