
package Interfaz_AWT;

import java.awt.*;

public class Kit_herramientas extends Frame{
    Image icon;
    
    public Kit_herramientas(){
        icon = Toolkit.getDefaultToolkit().getImage("C:\\Usuarios\\LUIS ALEJANDRO\\Imágenes\\Perro.jpg");
        setIconImage(icon);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
}
