package gui;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
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
        this.addActionListener(e -> {
            show.set(true);
            System.out.println("Popupmenu show");
            menu.setFocusable(true);
            menu.setVisible(show.get());
        });
        // As i only need one method, the mouse pressed i will itilize mouse Adapter
        Toolkit.getDefaultToolkit().addAWTEventListener(event -> {
            if (event instanceof MouseEvent mouseEvent) {
                System.out.println("Menu should close as mouse is pressed");
                System.out.println("Global Mouse Click at: " + mouseEvent.getPoint());
                menu.setVisible(false);
            }
        }, AWTEvent.MOUSE_EVENT_MASK);
        // Popup menu is not killed when shutting down the window.
        // So as i have gathered it i have two options for my listening to mouse clicks. I either have a mouse click on the Jpanel and then have to go through every button, check if
        // They have their popupmenu displayed. If they do and the mouse is not currently intersecting that component turn of visibility.
        // Or i add a global mouse listener so that every button listens for all mouse clicks. Then turns off their popup menu if the click is not on the popupmenu
    }
}
