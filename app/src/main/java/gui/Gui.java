package app.src.main.java.gui;
// Will contain the UI for the block code. It will be this class one runs i think.
// So From what i have gathered i will create a ui where one can add instructions to a list. These instructions will have a pulldown bar with different instructions like press A
// Hold A, or such. Then one can press create script. The instructions will be read and turned into an autohotkey script. Which will be compiled and turned into an exe file.
// This will allow any person to create a botting program as they please relatively easily without having to type code. They can instead just put in block of instructions.
// I also want to be able to read scripts and turn them into instructions. So if one needs to edit a script after having closed the program once they can do so.
// Additionally it might be interesting to create another program which maps/simulates the movements and actions taken by the bot.


import javax.swing.JFrame;
public class Gui{
    private JFrame frame;
    public Gui(){
        frame = new JFrame();
        frame.setTitle("BotMaker");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }


}