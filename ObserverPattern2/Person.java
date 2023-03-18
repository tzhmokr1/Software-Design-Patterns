
public class Person implements NewsletterObserver {
	
	private String name;
	private Newsletter currentNewsletter;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(Newsletter newsletter) {
		currentNewsletter = newsletter;
		System.out.println(name + " hat den neuen Newsletter zum Thema " +
						currentNewsletter.getTopic() + " erhalten!");
	}
	
}
