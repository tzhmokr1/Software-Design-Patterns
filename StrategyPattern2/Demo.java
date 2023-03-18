
public class Demo {

	public static void main(String[] args) {
		
		Investment investment1 = new Investment(300.00);
		investment1.talkToBankEmployee();
		investment1.setChoosenStrategy(new GoldInvestment());
		investment1.makeInvestment();
		
	}

}
