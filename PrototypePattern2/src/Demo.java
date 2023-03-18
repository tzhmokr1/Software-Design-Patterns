
public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		HospitalEmployee employeeNr1 = new HospitalEmployee("Hendrik", "Pruin", new Address("Mondstraße", 2, "39475"), "Artzt");
		HospitalEmployee employeeNr2 = employeeNr1.clone();
		
		System.out.println(employeeNr1);
		System.out.println(employeeNr2);
		employeeNr2.setFirstName("Franziska");
		employeeNr2.setLastName("Bauer");
		employeeNr2.setAddress(new Address("Tulpenstraße", 13, "74562"));
		employeeNr2.setPosition("Krankenschwester");
		System.out.println(employeeNr1);
		System.out.println(employeeNr2);


	}

}
