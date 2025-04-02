package gui;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.concurrent.atomic.AtomicBoolean;
public class FocEvent extends FocusAdapter {
    AtomicBoolean s;
    public FocEvent(AtomicBoolean s){
        this.s = s;

    }
    @Override
    public void focusLost(FocusEvent e){
        s.set(false);
    }
}
