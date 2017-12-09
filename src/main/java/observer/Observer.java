package observer;

/**
 * Created by schiduvasile on 12/9/17.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
