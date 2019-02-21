/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulazionedadisemafori;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luca
 */
public class SimulazioneDadiSemafori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Semaforo sem1=new Semaforo(1);
            CDatiCondivisi dati=new CDatiCondivisi();
            
            ThDado1 th1=new ThDado1(dati,sem1);
            ThDado2 th2=new ThDado2(dati,sem1);
            ThVisualizza th3=new ThVisualizza(dati);
            
            th1.start();
            th2.start();
            
            th1.join();
            th2.join();
            
            th3.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(SimulazioneDadiSemafori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
