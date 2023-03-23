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
public class dataa {
    private int no;
    private String nama;
    private int kode;
    private String telp;
    public dataa( int no, String nama, int kode, String telp){
        this.no=no;
        this.nama=nama;
        this.kode=kode;
        this.telp=telp;
        
    } 

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
