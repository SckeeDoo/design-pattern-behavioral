package memento;

/**
 * Created by schiduvasile on 12/9/17.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}