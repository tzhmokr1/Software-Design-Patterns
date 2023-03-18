
public class Investment {
	
	private double investmentMoney;
	private boolean talkedToBankEmployee = false;
	private InvestmentStrategy choosenStrategy;
	
	public Investment(double investmentMoney) {
		this.investmentMoney = investmentMoney;
	}
	
	public void talkToBankEmployee() {
		System.out.println("Das Beratungsgespräch lief super!");
		talkedToBankEmployee = true;
	}
	
	public void setChoosenStrategy(InvestmentStrategy strategy) {
		this.choosenStrategy = strategy;
		System.out.println("Die Strategie wurde gewählt!");
	}
	
	public void makeInvestment() {
		if(choosenStrategy != null && talkedToBankEmployee == true) {
			choosenStrategy.invest(investmentMoney);
		}
		else {
			throw new RuntimeException("Es muss zunächst ein Beratungsgespräch durchgeführt werden oder eine Strategie gewählt werden!");
		}
	}
	
}
