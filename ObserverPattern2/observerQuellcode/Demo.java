
public class Demo {

	public static void main(String[] args) {
		
		SportNewsletter sn = new SportNewsletter(new Newsletter("WM 2018", "Inhalt..."));
		
		Person person1 = new Person("Hendrik");
		Person person2 = new Person("Fritz");
		Person person3 = new Person("Fabienne");
		
		sn.subscribe(person1);
		sn.subscribe(person2);
		
		sn.setCurrentNewsletter(new Newsletter("Olympische Winterspiele", "Inhalt..."));
		
		sn.unsubscribe(person1);
		sn.subscribe(person3);
		
		sn.setCurrentNewsletter(new Newsletter("Sport ist Mord", "Inhalt...."));
		
	}

}
