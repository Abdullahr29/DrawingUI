package OtherUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener{
    JMenu menu; // One menu
    JMenuItem item;// Which has one item
    JMenuItem item1;
    JMenuItem item2;
    JMenuItem item3;
    public MainMenu(){
        menu=new JMenu("The Menu");
        item=new JMenuItem("Hey");
        item1 = new JMenuItem("There");
        item2 = new JMenuItem("Sexy");
        item3 = new JMenuItem(";)");
        item.addActionListener(this);
        add(menu); // Add the JMenu to the JMenuBar
        menu.add(item);// Add the JMenuItem to the JMenu
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
    }
    @Override
    // If 'this' is set as the ActionListener to all menu items, this method will
    // be called whenever any menu item is selected, but the ActionEvent
    // command will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}

