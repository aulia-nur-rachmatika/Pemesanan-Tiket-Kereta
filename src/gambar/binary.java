/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gambar;

/**
 *
 * @author AULIA NUR RACHMATIKA
 */
public class binary {
    private int maxSize;
    private int currentSize;
    private dataa[] heapArray;
    private int last;
    
        private dataa dt[];
        private int nElemen;
        
    public dataa binary(int key){
    int batasAtas = nElemen-1;
    int batasBawah =0;
    boolean belumKetemu= true;
    while (belumKetemu){
    int posisiSaatIni = (batasAtas+batasBawah)/2;
    
    if (dt[posisiSaatIni].getKode()== key){
        belumKetemu=false;
        return dt[posisiSaatIni];
    }else if (batasBawah>batasAtas){
        break;
    }else{
        if (dt[posisiSaatIni].getKode()<0){
            batasBawah=posisiSaatIni+1;
            
        }else {
            batasAtas=posisiSaatIni-1;
        }
    }
}
    return null;
    }
 
}
