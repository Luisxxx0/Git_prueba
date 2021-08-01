
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Oyente_raton extends Frame implements MouseListener{
    Label l;
    
    public Oyente_raton(){
        addMouseListener(this);
        
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        l.setText("Raton activado");
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }
    
    public void mouseEntered(MouseEvent e){
        l.setText("Raton ingreso");
    }
    
    public void mouseExited(MouseEvent e){
        l.setText("Raton salio");
    }
    
    public void mousePressed(MouseEvent e){
        l.setText("Raton presionado");
    }
    
    public void mouseReleased(MouseEvent e){
        l.setText("Raton suelto");
    }
}
