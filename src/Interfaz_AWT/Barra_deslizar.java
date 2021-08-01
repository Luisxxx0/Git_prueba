
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Barra_deslizar extends Frame implements AdjustmentListener{
    final Label l;
    final Scrollbar s;
    
    public Barra_deslizar(){
        super("Ejemplo");
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400, 100);
        s = new Scrollbar();
        s.setBounds(100, 100, 50, 100);
        
        s.addAdjustmentListener(this);
        
        add(s);add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e){
        l.setText("El valor de la barra vertical de deslizar: "+ s.getValue());
    } 
}
