/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulazionedadisemafori;

/**
 *
 * @author Luca
 */
public class ThVisualizza extends Thread{
    CDatiCondivisi PtrDati;
    
    public ThVisualizza(CDatiCondivisi dati) {
        PtrDati=dati;
    }
    
    public void run() {
        System.out.println("Il lancio del primo dado ha dato:"+PtrDati.getNumero(0));
        System.out.println("Il lancio del secondo dado ha dato:"+PtrDati.getNumero(1));
    }
}
