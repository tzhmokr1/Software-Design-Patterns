
public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String userName) {
		super(mediator, userName);
	}

	@Override
	public void sendToAll(String message) {
		System.out.println(this.userName + ": " + message);
		mediator.broadcastMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.userName + " hat Nachricht erhalten: " + message);
	}

	@Override
	public void sendPrivate(String message, User user) {
		mediator.privateMessage(message, user);
	}
	
	
	
}
