
public class Demo {

	public static void main(String[] args) {
		ChatMediator chat = new ChatMediatorImpl();
		User user1 = new UserImpl(chat, "Hendrik");
		User user2 = new UserImpl(chat, "Janek");
		User user3 = new UserImpl(chat, "Anna");
		User user4 = new UserImpl(chat, "Thaddeus");
		
		chat.addUser(user1);
		chat.addUser(user2);
		chat.addUser(user3);
		chat.addUser(user4);
		
		user2.sendToAll("Hallo Freunde, wie geht es euch heute?");
		System.out.println();
		user3.sendPrivate("Hallo Janek, wir müssen uns treffen! LG Anna", user2);

	}

}
