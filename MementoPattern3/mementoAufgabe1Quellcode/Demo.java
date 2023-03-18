
public class Demo {

	public static void main(String[] args) {
		
		BookCaretaker bookCaretaker1 = new BookCaretaker();
		
		Book book1 = new Book("Steve Jobs Biografie", "Inhalt...", "ISBN-978-4-2345");
		bookCaretaker1.saveBook(book1);
		System.out.println(book1);
		
		book1.setContent("Neuer Inhalt....");
		System.out.println(book1);
		
		bookCaretaker1.restoreBook(book1);
		System.out.println(book1);
		
	}

}
