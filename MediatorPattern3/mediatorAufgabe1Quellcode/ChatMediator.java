
public interface ChatMediator {
	public void broadcastMessage(String message, User user);
	public void privateMessage(String message, User user);
	public void addUser(User user);
}
