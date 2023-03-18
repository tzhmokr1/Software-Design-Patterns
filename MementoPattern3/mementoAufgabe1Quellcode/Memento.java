
public class Memento {
	
	private String title;
	private String content;
	private String isbnNumber;
	
	public Memento(String title, String content, String isbnNumber) {
		this.title = title;
		this.content = content;
		this.isbnNumber = isbnNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}
	
	
	
}
