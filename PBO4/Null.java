/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO4;

public class Null {
    public static void main(String[] args) {
        // Deklarasi objek
        LingkaranBase l1 = new LingkaranBase(5);
        LingkaranBase l2 = l1;
        LingkaranBase l3 = new LingkaranBase(7);

        // Menampilkan nilai jari-jari
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        // Menghapus referensi objek
        l1 = null;
        l2 = null;
        l3 = null;
    }
}