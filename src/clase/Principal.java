
package clase;


public class Principal{  //formaHilo1: implemtens Runnable
    
    /*@Override
    public void run(){
        System.out.println("¡Hola desde un hilo!");
    }*/
    
    public static void main(String[] args){
        new HiloSimple("Jamaica").start();
        new HiloSimple("Medellin").start();
        //(new Thread(new Principal())).start(); //primera forma de creación de un hilo
        //(new Principal()).start(); //segunda forma hilo
        /*Agenda agenda = new Agenda();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        
        p1.setNombre("Nixon");
        p1.setEdad(43);
        p1.setCiudad("Bogota");
        p1.setTelefono("321654");
        
        p2.setNombre("Alonso");
        p2.setEdad(30);
        p2.setCiudad("Chia");
        p2.setTelefono("987456");
        
        p3.setNombre("Maria");
        p3.setEdad(36);
        p3.setCiudad("Cali");
        p3.setTelefono("223311");
        
        System.out.println("Agregando personas...\n");
        
        agenda.agregar(p1);
        agenda.agregar(p2);
        agenda.agregar(p3);
        
        System.out.println("Consultando por nombre...");
        
        Persona pbuscar = agenda.buscar("Alonso");
        System.out.println(pbuscar.getNombre());
        System.out.println(pbuscar.getEdad());
        System.out.println(pbuscar.getCiudad());
        System.out.println(pbuscar.getTelefono());
        
        System.out.println("\nConsultando por edad...");
        
        pbuscar = agenda.buscar(36);
        System.out.println(pbuscar.getNombre());
        System.out.println(pbuscar.getEdad());
        System.out.println(pbuscar.getCiudad());
        System.out.println(pbuscar.getTelefono());
        
        System.out.println("\nConsultando por edad y ciudad...");
        
        pbuscar = agenda.buscar(30, "Chia");
        System.out.println(pbuscar.getNombre());
        System.out.println(pbuscar.getEdad());
        System.out.println(pbuscar.getCiudad());
        System.out.println(pbuscar.getTelefono());*/
    }
}
