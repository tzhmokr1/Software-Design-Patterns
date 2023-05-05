import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator{
	
	private ArrayList<User> userList;
	
	public ChatMediatorImpl() {
		this.userList = new ArrayList<User>();
	}

	@Override
	public void broadcastMessage(String message, User user) {
		for(User u : userList) {
			//Message soll nicht vom Empfänger erhalten werden, der sie gerade sendet...
			if(u != user) {
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.userList.add(user);
	}

	@Override
	public void privateMessage(String message, User user) {
		user.receive(message);
	}
	
	
}
