/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulazionedadisemafori;

import java.util.Random;

/**
 *
 * @author Luca
 */
public class ThDado2 extends Thread{
    int NumeroEstratto;
    CDatiCondivisi PtrDati;
    Semaforo sem1;

    public ThDado2(CDatiCondivisi dati,Semaforo sem1) {
        this.NumeroEstratto = 0;
        PtrDati=dati;
        this.sem1=sem1;
    }
    
    public void run() {
        Random rand=new Random();
        NumeroEstratto=rand.nextInt(6)+1;
        sem1.Wait();
        PtrDati.setNumero(1, NumeroEstratto);
        sem1.Signal();
    }
}
