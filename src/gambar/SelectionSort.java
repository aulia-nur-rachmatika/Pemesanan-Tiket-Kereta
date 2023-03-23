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
public class SelectionSort {

    private dataa[] dt;
    private int nElemen;
    int max;
public SelectionSort(int max){
    dt= new dataa[max];
    nElemen=0;
    
}
    public void insert(int no,String nama, int kode, String telp) {
        dt[nElemen] = new dataa(no,nama, kode, telp);
        nElemen++;
    }

    public void selectionSorting() {
        int awal, i, min;

        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (dt[i].getNama().compareToIgnoreCase(dt[min].getNama()) < 0) {
                    min = i;
                }

            }
            swap(awal, min);
        }
    }

    public void swap(int one, int two) {
        dataa temp = dt[one];
        dt[one] = dt[two];
        dt[two] = temp;
    }

}
