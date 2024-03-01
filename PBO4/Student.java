/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO4;

/**
 *
 * @author alzxi
 */
public class Student {
 private String nrp;

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }

    public static void main(String[] args) {
        // Membuat objek x
        Student x = new Student();

        // Menyamakan objek y dengan objek x
        Student y = x;

        // Mengatur NRP objek x menjadi "01"
        x.setNrp("01");

        // Mengatur NRP objek y menjadi "02"
        y.setNrp("02");

        // Menampilkan NRP objek x
        System.out.println(x.getNrp());

        // Membuat objek z
        Student z = new Student();

        // Mengatur NRP objek z menjadi "03"
        z.setNrp("03");

        // Menyamakan objek x dengan objek z
        x = z;

        // Menampilkan NRP objek x
        System.out.println(x.getNrp());

        // Menampilkan NRP objek y
        System.out.println(y.getNrp());
    }
}