package mediator;

/**
 * Created by schiduvasile on 12/7/17.
 */
public class MediatorDemo {

    public static void main(String[] args) {
        User user1 = new User("Johnny");
        User user2 = new User("Robbert");

        user1.sendMessage("Hello there!");
        user2.sendMessage("Holla!!!");
    }

}
