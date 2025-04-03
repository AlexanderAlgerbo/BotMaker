package gui;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
public class Gui{
    private JFrame frame;
    private JPanel panel;
    JPopupMenu popupMenu = new JPopupMenu();
    // Kanske vill ha alla dessa i en lista senare.
    private List<String> actions = new ArrayList<>();
    private List<JButton> buttons = new ArrayList<>();
    public Gui(List<String> actions){
        frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(null);
        //scrollPane.add(new JButton("Hello"));
        this.actions = actions;
        frame.setTitle("BotMaker");
        this.actions = actions;
        initPopup();
        addPopupMenu();
        addPopupMenu();
        frame.add(panel);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);


    }

    public void addToList(String s){
        actions.add(s);
    }
    private void initPopup(){
        List<JMenuItem> menuItems = new ArrayList<>();
        for(int i = 0; i < actions.size();i++){
            // För varje action som är implementerad så vill vi displaya den som ett alternativ för blocket. Vill nog definitivt skapa en factory class som skapar
            // alla JComponents för dem olika action blocken som sedan skapas. 
            menuItems.add(new JMenuItem(actions.get(i)));
            popupMenu.add(menuItems.get(i));// Lägger till vårat item i popupmenyn.
        }
    }
    // Vi börjar med att skapa en drop down menu.
    // Man väljer vilken action. Sen kommer ett objekt placeras där istället med text boxar eller annat som man använder för att ställa in
    // Till exempel om man väljer action Press W. Så kommer en textBox placeras om hur länge.
    private void addPopupMenu(){
        
        // Here our popup menu should be finished so we can create our button and add it to a list as i want to be able to remove it later when using blocks.
        buttons.add(new JButton());
        buttons.getLast().setBounds(0, (buttons.size()-1)*150, 100, 150);
        panel.add(buttons.getLast());
        panel.revalidate(); // Make sure the layout is updated
        panel.repaint(); 
        System.out.println("Here");
    }

    // Dags att skapa en metod för att displaya popupmenyn på buttonen som man tryckte
    // Vi kör sen att vi har en knapp för att spawna alla Block. Vi hade kunnat testa på en drag and drop typ av menu. Eller så gör jag så att block som repeat bara får
    // Sin egna add knapp. Vi kan testa drag and drop först.
}