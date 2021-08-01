
package Interfaz_AWT;

import java.awt.*;

public class Menu_ejemplo extends Frame{
    MenuBar mb;
    Menu menu,submenu;
    MenuItem i1,i2,i3,i4,i5;
    
    public Menu_ejemplo(){
        super("Ejemplo de menu y menuItem");
        mb = new MenuBar();
        menu = new Menu("Menu");
        submenu = new Menu("Submenu");
        i1 = new MenuItem("Item 1");
        i2 = new MenuItem("Item 2");
        i3 = new MenuItem("Item 3");
        i4 = new MenuItem("Item 4");
        i5 = new MenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        setMenuBar(mb);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
}
