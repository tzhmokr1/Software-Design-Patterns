
public class Demo {

	public static void main(String[] args) {
		
		ChannelCollection radio = new CarRadio();
		radio.addChannel(new Channel("Antenne Bayern", 103.7));
		radio.addChannel(new Channel("Bayern 3", 102.1));
		radio.addChannel(new Channel("KissFM", 105.4));
		
		ChannelIterator normalIterator = radio.createIterator();
		
		while(normalIterator.hasNext()) {
			Channel c = normalIterator.next();
			System.out.println(c);
		}
		
	}

}
