
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Cuadro_dialogo implements ActionListener{
    private static Dialog d;
    Frame f;
    Button b;
    
    public Cuadro_dialogo(){
        f = new Frame();
        d = new Dialog(f,"Ejemplo de cuadro de dialogo", true);
        d.setLayout(new FlowLayout());
        b = new Button("Vale");
        
        b.addActionListener(this);
        
        d.add(new Label("Presiona el boton para continuar."));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Cuadro_dialogo.d.setVisible(false);
    }
}
