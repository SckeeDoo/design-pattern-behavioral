package mediator;

/**
 * Created by schiduvasile on 12/7/17.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println("["+ user.getName() + "]: "+ message);

    }

}
