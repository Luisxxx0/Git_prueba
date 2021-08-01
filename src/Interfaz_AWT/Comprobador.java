
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Comprobador extends Frame implements ItemListener{
    CheckboxGroup cbg;
    Checkbox chb1, chb2;
    final Label l;
            
    public Comprobador(){
        super("Ejemplo de caja de confirmación");
        l= new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        cbg = new CheckboxGroup();
        chb1 = new Checkbox("C++",cbg,false);
        chb1.setBounds(100, 100, 50, 50);
        chb2 = new Checkbox("Java",cbg,false);
        chb2.setBounds(100, 150, 50, 50);
        
        chb1.addItemListener(this);
        chb2.addItemListener(this);
        
        add(chb1);add(chb2);add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==chb1)
            //l.setText("C++ caja de confirmacion: "+ (e.getStateChange()==1?"listo":"sin enlistar"));
            l.setText("C++ caja de confirmacion: listo");
        else if(e.getSource()==chb2)
            //l.setText("Java caja de confirmacion: "+ (e.getStateChange()==1?"listo":"sin enlistar"));
            l.setText("Java caja de confirmacion: listo");
    }
}
