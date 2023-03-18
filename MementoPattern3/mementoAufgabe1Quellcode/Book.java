
public class Book {
	
	private String title;
	private String content;
	private String isbnNumber;
	
	public Book(String title, String content, String isbnNumber) {
		this.title = title;
		this.content = content;
		this.isbnNumber = isbnNumber;
	}
	
	public Memento saveBook() {
		System.out.println("Buch wurde erfolgreich gespeichert...");
		return new Memento(this.title, this.content, this.isbnNumber);
	}
	
	public void restoreBook(Memento memento) {
		this.title = memento.getTitle();
		this.content = memento.getContent();
		this.isbnNumber = memento.getIsbnNumber();
		System.out.println("Der ursprüngliche Zustand des Buchs wurde wiederhergestellt...");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
	@Override
	public String toString() {
		return title + " (" + isbnNumber + "): " + content;
	}
	
}
