
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Escoger extends Frame implements ActionListener{
    final Label l;
    Button b;
    final Choice c;
    
    public Escoger(){
        super("Escoga alguna opción");
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        b = new Button("Mostrar");
        b.setBounds(200, 100, 50, 20);
        c = new Choice();
        c.setBounds(100, 100, 75, 75);
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("PHP");
        c.add("Android");
        
        b.addActionListener(this);
        
        add(c);add(l);add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String dato = "Lenguaje de programación seleccionado: "+ c.getItem(c.getSelectedIndex());
        l.setText(dato);
    }
}
