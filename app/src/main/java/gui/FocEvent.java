package gui;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JPopupMenu;
public class FocEvent extends FocusAdapter {
    JPopupMenu s;
    public FocEvent(JPopupMenu s){
        this.s = s;

    }
    @Override
    public void focusLost(FocusEvent e){
        System.out.println("FocusLost");
        s.setFocusable(false);
        s.setVisible(false);
    }
}
