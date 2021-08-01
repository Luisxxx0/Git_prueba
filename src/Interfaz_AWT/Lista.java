
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Lista extends Frame implements ActionListener{
    Label l;
    Button b;
    final List l1,l2;
    
    public Lista(){
        super("Lista");
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(500,100);
        b = new Button("Mostrar");
        b.setBounds(200, 150, 80, 30);
        l1 = new List(4,false);
        l1.setBounds(100, 100, 70, 70);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("PHP");
        l2 = new List(4,true);//El true es para seleccionar varias opciones
        l2.setBounds(100, 200, 70, 70);
        l2.add("Turbo C++");
        l2.add("Spring");
        l2.add("HIbernate");
        l2.add("CodeIgneter");
        
        b.addActionListener(this);
        
        add(l1);add(l2);add(l);add(b);
        setSize(450,450);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String data = "Lenguaje de programación seleccionado: "+ l1.getItem(l1.getSelectedIndex());
        data += ", Marco de trabajo seleccionado: ";
        for(String marco:l2.getSelectedItems())
            data += marco + ",";
        l.setText(data);
    }
}
