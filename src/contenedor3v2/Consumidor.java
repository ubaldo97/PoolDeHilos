/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedor3v2;




/**
 *
 * @author ruben
 */
public class Consumidor extends Thread {
      private Contenedor cont;

    public Consumidor(Contenedor c) {
        this.cont = c;
    }
    public void run(){
        synchronized(cont){
            for(int i=0;i<10;i++){
                System.out.println("Consumidor obtiene: "+cont.sacar());
            }
        }
    }
}
