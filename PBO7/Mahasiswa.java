/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO7;

/**
 *
 * @author algi
 */
public class Mahasiswa {
    private String NRP;
    private String nama;
    
    public Mahasiswa(String nrp, String nama){
        this.NRP = nrp;
        this.nama = nama;
    }
    
    public String display(){
     return "NRP: " + NRP + " Nama : " + nama; 
    }
    
    
//    SETTER DAN GETTER

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
}
