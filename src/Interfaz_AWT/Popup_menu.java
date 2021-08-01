
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Popup_menu{
    final Frame f;
    final PopupMenu popup;
    MenuItem cortar,copiar, pegar;
    
    public Popup_menu(){
        f = new Frame("Ejemplo de menu emergente");
        popup = new PopupMenu("Edit");
        cortar = new MenuItem("Cortar");
        cortar.setActionCommand("Cut");
        copiar = new MenuItem("Copiar");
        copiar.setActionCommand("Copy");
        pegar = new MenuItem("Pegar");
        pegar.setActionCommand("Paste");
        popup.add(cortar);
        popup.add(copiar);
        popup.add(pegar);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popup.show(f, e.getX(), e.getY());
            }
        });
        f.add(popup);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}