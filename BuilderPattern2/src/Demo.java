
public class Demo {

	public static void main(String[] args) {
		HouseBuilder whb = new StoneHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(whb);
		
		engineer.constructHouse();
		
		House house = engineer.getHouse();
		System.out.println(house);

	}

}
