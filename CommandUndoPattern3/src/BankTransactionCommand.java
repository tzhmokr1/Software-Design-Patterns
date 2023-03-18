
public interface BankTransactionCommand {
	public void execute();
	public void undo();
}
