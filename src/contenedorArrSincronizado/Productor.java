/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedorArrSincronizado;

/**
 *
 * @author ruben
 */
public class Productor extends Thread {
     private Contenedor cont;

    public Productor(Contenedor c) {
     this.cont=c;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                cont.poner(i);
                System.out.println("Productor pone: "+i);
                this.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}