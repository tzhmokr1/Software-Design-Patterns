
public class BookCaretaker {
	
	private Memento lastSaving;
	
	public void saveBook(Book book) {
		lastSaving = book.saveBook();
	}
	
	public void restoreBook(Book book) {
		book.restoreBook(lastSaving);
	}
}
