
package Interfaz_AWT;

import java.awt.*;

public class EjemploPanel extends Frame{
    Panel panel;
    Button b1, b2;
    
    public EjemploPanel(){
        super("Ejemplo de panel");
        panel = new Panel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.GRAY);
        b1 = new Button("Boton 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        b2 = new Button("Boton 2");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.green);
        panel.add(b1);panel.add(b2);
        add(panel);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
}
