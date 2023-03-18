import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator{
	private ArrayList<User> userList;
	
	public ChatMediatorImpl() {
		this.userList = new ArrayList<User>();
	}

	@Override
	public void broadcastMessage(String message, User user) {
		for(User u : userList) {
			if(u != user) {
				u.recieve(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.userList.add(user);
	}
	
	
}
