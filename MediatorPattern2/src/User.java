
public abstract class User {
	protected ChatMediator mediator;
	protected String userName;
	
	public User(ChatMediator mediator, String userName) {
		this.mediator = mediator;
		this.userName = userName;
	}
	
	public abstract void sendToAll(String message);
	public abstract void recieve(String message);
}
