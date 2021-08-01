
package Interfaz_AWT;

import java.awt.*;

public class Canvasejem extends Frame{
    public Canvasejem(){
        super("Ejemplo Canvas");
        add(new MiCanvas());
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    
}

class MiCanvas extends Canvas{
    public MiCanvas(){
        setBackground(Color.GRAY);
        setSize(300,200);
    }
    @Override
    public void paint(Graphics g){//paint es palabra reservada para pintar ;)
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 75);
    }
}
