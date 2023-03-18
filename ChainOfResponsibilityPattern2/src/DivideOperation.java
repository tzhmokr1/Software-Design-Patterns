
public class DivideOperation implements CalculateChain {
	private CalculateChain nextInChain;

	@Override
	public void setNextChain(CalculateChain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getOperator() == "/") {
			System.out.println(request.getNumber1() + " / " + request.getNumber2() +
					" = " + (request.getNumber1() / request.getNumber2()));
		}
		else {
			System.out.println("Diese Operation kann nicht behandelt werden!");
		}
	}
}
