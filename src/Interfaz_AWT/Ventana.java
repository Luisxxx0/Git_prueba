
package Interfaz_AWT;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends Frame implements ActionListener{
    Button b;
    TextField tf;
    Label l1;
    
    public Ventana(){
        super("Esta es la ventana");
        
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        b = new Button("Encontrar IP");
        b.setBounds(100, 120, 80, 30);
        l1 = new Label();
        l1.setBounds(50, 100, 250, 20);
        
        b.addActionListener(this);
        
        add(b);add(tf);add(l1);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            String anfitrion = tf.getText();
            String ip = java.net.InetAddress.getByName(anfitrion).getHostAddress();
            l1.setText("La IP de "+ anfitrion + " es: "+ ip);
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        //new Ventana();
        //new Escucha_acciones();
        //new Areatexto();
        //new Comprobador();
        new Escoger();
        //new Lista();
        //new Canvasejem();
        //new Barra_deslizar();
        //new Menu_ejemplo();
        //new Popup_menu();
        //new EjemploPanel();
        //new Cuadro_dialogo();
        //Kit de herramientas
            /*Toolkit t = Toolkit.getDefaultToolkit();
            System.out.println("Resolución de pantalla: "+ t.getScreenResolution());
            Dimension d = t.getScreenSize();
            System.out.println("Amplitud de pantalla: "+ d.width);
            System.out.println("Altura de pantalla: "+ d.height);*/
            
            /*Frame f = new Frame("Ejemplo de kit de herramientas");
            Button b = new Button("pito");
            b.setBounds(50, 100, 60, 30);
            f.add(b);
            f.setSize(300,300);
            f.setLayout(null);
            f.setVisible(true);
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Toolkit.getDefaultToolkit().beep();
                }
            });*/
        //new Kit_herramientas();
        //new Oyente_raton();
        //new Movimiento_raton();
        //new Evento_ventana();
    }
}
