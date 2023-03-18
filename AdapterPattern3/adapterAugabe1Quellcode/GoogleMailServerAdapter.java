
public class GoogleMailServerAdapter implements MailServer {
	
	private GoogleMailServer mailServer;
	
	public GoogleMailServerAdapter(GoogleMailServer mailServer) {
		this.mailServer = mailServer;
	}

	@Override
	public void connectAndSendMail(String emailAddress, String content, String receiverName) {
		//Verbindung zum Konto aufbauen
		mailServer.buildConnection();
		
		//Mechanimus implementieren, der die zu sendende E-Mail verschlüsselt
		System.out.println("E-Mail erfolgreich verschlüsselt...");
		
		mailServer.sendEmail(emailAddress, content);
		System.out.println("Name des Empfängers: " + receiverName);
		
	}
	
	
}
