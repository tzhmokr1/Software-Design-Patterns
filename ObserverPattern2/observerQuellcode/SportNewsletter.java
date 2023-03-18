
public class SportNewsletter extends NewsletterSubject {
	
	private Newsletter currentNewsletter;
	
	public SportNewsletter(Newsletter newsletter) {
		this.currentNewsletter = newsletter;
	}
	
	public Newsletter getCurrentNewsletter() {
		return currentNewsletter;
	}
	
	public void setCurrentNewsletter(Newsletter newNewsletter) {
		this.currentNewsletter = newNewsletter;
		System.out.println("Ein neuer Newsletter ist erschienen!");
		this.sendNewsletter(currentNewsletter);
	}
	
}
