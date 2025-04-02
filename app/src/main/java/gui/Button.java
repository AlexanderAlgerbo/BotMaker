package gui;

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
        this.setSize(40, 50);
        this.menu = menu;
        show = new AtomicBoolean();
        show.set(false);

        // Should make it so that if the popupmenu goes out of focus it stops showing the menu.
        menu.addFocusListener(new FocEvent(show));
        this.addActionListener(e -> {
            show.set(true);
            System.out.println("Popupmenu show");
            menu.setVisible(show.get());
        });
        // Popup menu is not killed when shutting down the window.
    }
}
