public class Main
{
	public static void main(String[] args) {
        User user1 = new User("Mathew");
        User user2 = new User("AJ");
        User user3 = new User("Sam");

        user1.sendMessage("Hello All");
        user3.sendMessage("Hello Mathew");
        user2.sendMessage("Wassup");
        user1.sendMessage("All good");
	}
}
