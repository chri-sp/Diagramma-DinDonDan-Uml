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
public class CDatiCondivisi {
    int NumeriEstratti[];

    public CDatiCondivisi() {
        NumeriEstratti=new int[2];
        for(int i=0;i<2;i++) {
            NumeriEstratti[i]=0;
        }
        
    }

    public int getNumero(int pos) {
        return NumeriEstratti[pos];
    }

    public void setNumero(int pos,int numero) {
        this.NumeriEstratti[pos] = numero;
    }
    
    
    
    
    
    
}
