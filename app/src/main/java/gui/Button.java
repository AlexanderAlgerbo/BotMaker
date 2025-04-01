package app.src.main.java.gui;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JPopupMenu;

public class Button extends JButton {
    private final JPopupMenu menu;
    private AtomicBoolean show;
    // This button class will display a popupmenu when pressed.
    // Will probably make an icon of a arrow pointing down to signify a drop down menu.
    public Button(JPopupMenu menu){
        super();
        this.menu = menu;
        show.set(false);

        // Should make it so that if the popupmenu goes out of focus it stops showing the menu.
        menu.addFocusListener(new FocEvent(show));

    }
}
