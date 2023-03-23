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
public class heap {
    private int MaxSize;
    private int currentsSize;
    private dataa[] heapArray;
    private int last;

public heap(int size){
MaxSize=size;
heapArray = new dataa[size];
currentsSize=0;
last=0;
}
//public boolean insert(int no, String nama, int kode, String telp){
//    dataa dt = new dataa(no,nama,kode,telp);
//    heapArray[currentsSize]=dt;
//    
//}
}
