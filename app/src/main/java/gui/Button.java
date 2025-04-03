package gui;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JPopupMenu;

import system.Logic;

public class Button extends JButton {
    private final JPopupMenu menu;
    private AtomicBoolean show;
    // This button class will display a popupmenu when pressed.
    // Will probably make an icon of a arrow pointing down to signify a drop down menu.
    public Button(JPopupMenu menu, int width, int height){
        super();
        //setSize(new Dimension(width, height));
        this.menu = menu;
        show = new AtomicBoolean();
        show.set(false);
        this.menu.setLocation(getX() + width, getY() + height);
        System.out.println(menu.getX()+ "," + menu.getY());
        // Should make it so that if the popupmenu goes out of focus it stops showing the menu.
        this.addActionListener(e -> {
            show.set(true);
            System.out.println("Popupmenu show");
            this.menu.setFocusable(true);
            this.menu.setVisible(show.get());
        });
        // As i only need one method, the mouse pressed i will itilize mouse Adapter
        Toolkit.getDefaultToolkit().addAWTEventListener(event -> {
            if (event instanceof MouseEvent mouseEvent) {
                System.out.println("Menu should close as mouse is pressed");
                if(!Logic.contains(mouseEvent.getPoint().x, mouseEvent.getPoint().x, this.menu.getX(), this.menu.getY(), this.menu.getWidth(), this.menu.getHeight())){
                    // Fungerar för x position. INte för Y position. Se till att menyn också hamnar efter buttonen.
                    this.menu.setVisible(false);
                }
                System.out.println("Global Mouse Click at: " + mouseEvent.getPoint());
                
                //mouseEvent.getSource();

            }
        }, AWTEvent.MOUSE_EVENT_MASK);

    }


}
