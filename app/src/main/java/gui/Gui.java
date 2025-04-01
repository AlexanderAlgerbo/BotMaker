package app.src.main.java.gui;
// Will contain the UI for the block code. It will be this class one runs i think.
// So From what i have gathered i will create a ui where one can add instructions to a list. These instructions will have a pulldown bar with different instructions like press A
// Hold A, or such. Then one can press create script. The instructions will be read and turned into an autohotkey script. Which will be compiled and turned into an exe file.
// This will allow any person to create a botting program as they please relatively easily without having to type code. They can instead just put in block of instructions.
// I also want to be able to read scripts and turn them into instructions. So if one needs to edit a script after having closed the program once they can do so.
// Additionally it might be interesting to create another program which maps/simulates the movements and actions taken by the bot.


import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.*;
public class Gui{
    private JFrame frame;
    private JPanel panel;
    private List<String> actions;
    // Kanske vill ha alla dessa i en lista senare.
    private List<String> data = new ArrayList<String>();
    public Gui(List<String> actions){
        frame = new JFrame();
        panel = new JPanel();
        this.actions = actions;
        frame.setTitle("BotMaker");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    public void addToList(String s){
        data.add(s);
    }

    // Vi börjar med att skapa en drop down menu.
    // Man väljer vilken action. Sen kommer ett objekt placeras där istället med text boxar eller annat som man använder för att ställa in
    // Till exempel om man väljer action Press W. Så kommer en textBox placeras om hur länge.
    private void addPopupMenu(){
        JPopupMenu popupMenu = new JPopupMenu();
        List<JMenuItem> menuItems = new ArrayList<>();
        for(int i = 0; i < actions.size();i++){
            // För varje action som är implementerad så vill vi displaya den som ett alternativ för blocket. Vill nog definitivt skapa en factory class som skapar
            // alla JComponents för dem olika action blocken som sedan skapas. 
            menuItems.add(new JMenuItem(actions.get(i)));
            popupMenu.add(menuItems.get(i));// Lägger till vårat item i popupmenyn.
        }
    }
}