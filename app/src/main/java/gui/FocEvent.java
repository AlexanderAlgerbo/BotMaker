package app.src.main.java.gui;
import java.util.EventListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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
