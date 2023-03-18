
public class Demo {

	public static void main(String[] args) {
		MacBookPro pc1 = new MacBookPro();
		pc1.increaseVolume();
		System.out.println(pc1.getdescription());
		System.out.println(pc1.getPrice());
		
		AddonTouchbar macBookWithTouchbar = new AddonTouchbar(pc1);
		macBookWithTouchbar.increaseVolume();
		System.out.println(macBookWithTouchbar.getdescription());
		System.out.println(macBookWithTouchbar.getPrice());
		
		AddonI5Processor macBookWithTouchAndI5 = new AddonI5Processor(macBookWithTouchbar);
		macBookWithTouchAndI5.increaseVolume();
		System.out.println(macBookWithTouchAndI5.getdescription());
		System.out.println(macBookWithTouchAndI5.getPrice());
		

	}

}
