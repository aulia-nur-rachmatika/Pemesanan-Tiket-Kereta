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
public class DataArray {
    private dataa[] dt;
    private int nElemen;
    int max;
    
    public DataArray(int max){
        dt=new dataa[max];
        this.max=max;
        nElemen=0;
    }
    public void insert (int no,String nama,int kode,  String telp){
        dt[nElemen]=new dataa(no,nama,kode,telp);
    nElemen++;
    }
    public class binary {
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
 
//}public void  swap(int one, int two){
//    
//}
}
}
