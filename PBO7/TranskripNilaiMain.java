/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO7;

/**
 *
 * @author algi
 */
public class TranskripNilaiMain {
    public static void main(String[] args) {
    //    OBJEK MATAKULIAH
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1","A",3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2","BC",3);
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Berorientasi Objek","B",3);
        
    //     OBJEK KHS
        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

    //     OBJEK MAHASISWA
        Mahasiswa mhs = new Mahasiswa("223040001", "Muhammad Al Ghifari");

    //     OBJEK TRANSKRIPT
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK();
        transkrip.display();
    
    }
}
