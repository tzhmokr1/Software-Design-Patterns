
public class Demo {

	public static void main(String[] args) {
		
		GoogleMailServer mailServer = new GoogleMailServer();
		mailServer.buildConnection();
		mailServer.sendEmail("test@gmx.de", "Das ist die erste E-mail");
		
		System.out.println();
		
		MailServer adapterMailServer = new GoogleMailServerAdapter(mailServer);
		adapterMailServer.connectAndSendMail("hendrik@gmx.de", "Das ist die zweite E-Mail", "Hendrik P");
		
	}
	
}
