
package clase;

public class HiloSimple extends Thread{
    public HiloSimple(String str){
            super(str);
    }
        
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i + " "+ getName());
            try{
                sleep((int)(Math.random()*1000));
            } catch (InterruptedException e){
                    
            }
        }
        System.out.println("¡Hecho! "+ getName());
    }
}
