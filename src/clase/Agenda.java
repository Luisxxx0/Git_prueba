
package clase;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Persona> lista = new ArrayList<Persona>();
    
    public boolean agregar (Persona p){
        boolean rta = false;
        
        lista.add(p);
        rta = true;
        return rta;
    }
    
    public Persona buscar (String nombre){
        Persona p = new Persona();
        
        for (int i = 0; i <lista.size(); i++)
            if (lista.get(i).getNombre().equals(nombre)){
                p = lista.get(i);
                break;
            }
        return p;
    }
    
    public Persona buscar (int edad){
        Persona p = new Persona();
        
        for (int i = 0; i <lista.size(); i++)
            if (lista.get(i).getEdad() == edad){
                p = lista.get(i);
                break;
            }
        return p;
    }
    
    public Persona buscar (int edad, String ciudad){
        Persona p = new Persona();
        
        for (int i = 0; i <lista.size(); i++)
            if (lista.get(i).getEdad() == edad && lista.get(i).getCiudad().equals(ciudad)){
                p = lista.get(i);
                break;
            }
        return p;
    }
}
