/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Waldo
 */
public class Menu {
    
<<<<<<< HEAD
//    private JMenuBar menuBar = new JMenuBar();
//    
//    public Menu() {
//        JMenu menu = new JMenu("Menu");
//        menuBar.add(menu);
//        JMenuItem createDNMenu = new JMenuItem(new AbstractAction() {
//            public void actionPerformed(ActionEvent e) {
//                MainPage.showNewDN();
//            }
//        });
//        createDNMenu.setText("Create Delivery Note");
//        menu.add(createDNMenu);
//        
//    }
//    
//    public JMenuBar getMenuBar() {
//        return menuBar;
//    }
//    
=======
    private JMenuBar menuBar = new JMenuBar();
    
    public Menu() {
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        JMenuItem createDNMenu = new JMenuItem(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                MainPage.showNewDN();
            }
        });
        createDNMenu.setText("Create Delivery Note");
        menu.add(createDNMenu);
        
    }
    
    public JMenuBar getMenuBar() {
        return menuBar;
    }
    
>>>>>>> c1328abe17604fec6deaff595e32728a075f3dd6
}
