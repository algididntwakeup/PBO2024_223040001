/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO5;

/**
 *
 * @author algi
 */
public class MatakuliahMain {
    public static void main(String[] args) {
        // Create objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Struktur Data", "A", 4);
        Matakuliah mk3 = new Matakuliah("003", "Basis Data", "B", 3);
        
        // Tampilkan daftar matakuliah
        System.out.println("-- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());
        System.out.println("--- Nilai IPK ---");

        // Hitung total nilai * sks
        double totalNilaiSks = (mk1.nilaiIndex() * mk1.getSks()) + 
                                (mk2.nilaiIndex() * mk2.getSks()) +
                                (mk3.nilaiIndex() * mk3.getSks());
        
        // Hitung total SKS
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        
        // Hitung IPK
        double ipk = totalNilaiSks / totalSks;
        
        // Tampilkan IPK
        System.out.println("IPK: " + ipk);
    }
}
