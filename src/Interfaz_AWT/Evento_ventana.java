
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Evento_ventana extends Frame implements WindowListener{
    public Evento_ventana(){
        addWindowListener(this);
        
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    public void windowActivated(WindowEvent arg0){
        System.out.println("Activado");
    }
    
    public void windowClosed(WindowEvent arg0){
        System.out.println("Cerrar");
    }
    
    public void windowClosing(WindowEvent arg0){
        System.out.println("Cerrando");
        //dispose();
        System.exit(0);
    }
    
    public void windowDeactivated(WindowEvent arg0){
        System.out.println("Desactivado");
    }
    
    public void windowDeiconified(WindowEvent arg0){
        System.out.println("Desiconificado");
    }
    
    public void windowIconified(WindowEvent arg0){
        System.out.println("Iconificado");
    }
    
    public void windowOpened(WindowEvent arg0){
        System.out.println("Abierta");
    }
}
