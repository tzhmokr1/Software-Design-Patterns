
public class Demo {

	public static void main(String[] args) {
		
		DownloadProduct javaEbook = new DownloadProduct("Java E-Book");
		Customer hendrik = new Customer("Hendrik Pruin");
		
		javaEbook.download(hendrik);
		javaEbook.download(hendrik);
		javaEbook.download(hendrik);
		javaEbook.download(hendrik);
		
		System.out.println();
		
		DownloadProductProxy patternEbook = new DownloadProductProxy("Design Patterns E-Book");
		patternEbook.download(hendrik);
		patternEbook.download(hendrik);
		patternEbook.download(hendrik);
		patternEbook.download(hendrik);
		
		javaEbook.download(hendrik);
		patternEbook.download(hendrik);
		
	}

}
