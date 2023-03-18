
public class Demo {

	public static void main(String[] args) {
		Directory videokurs = new Directory("Videokurs");
		
		File kursskript = new File("Kursskript", "Hendrik");
		Directory kursvideos = new Directory("Kursvideos");
		videokurs.add(kursskript);
		videokurs.add(kursvideos);
		
		Directory modul1 = new Directory("Modul 1");
		Directory modul2 = new Directory("Modul 2");
		kursvideos.add(modul1);
		kursvideos.add(modul2);
		
		File f1 = new File("Einführung", "Hendrik");
		File f2 = new File("Installation", "Franz");
		File f3 = new File("Variablen", "Fabienne");
		modul1.add(f1);
		modul2.add(f2);
		modul2.add(f3);
		
		videokurs.print("");

	}
}
