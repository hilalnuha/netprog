/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba7;

/**
 *
 * @author dewan
 */

class Bentuk {
    String nama = "Abstrak";
    
    void inisialisasi(String nama) {
        this.nama = nama;
    }
    
    void jumlahSisi() {
        System.out.println("Bentuk " + nama + " tidak memiliki sisi");
    }
}

class Persegi extends Bentuk {
    String nama = "Persegi";
    
    void inisialisasi(String nama) {
        nama = nama;
    }
    
    @Override
    void jumlahSisi() {
        System.out.println("Persegi memiliki 4 sisi");
        super.jumlahSisi();
    }
}

class Robot {
    static int jumlah = 0;
    final int maksimal = 100;
    
    Robot() {
        jumlah++;
        System.out.println("Saya adalah robot ke-" + jumlah);
    }
    
    void jumlahRobot() {
        System.out.println("Saat ini telah dibuat " + jumlah + " buah robot");
    }
}

public class Coba7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Bentuk b1 = new Bentuk();
        Persegi b2 = new Persegi();
        
        b1.inisialisasi("Tak-Berwujud");
        System.out.println("Nama objek = " + b1.nama);
        b1.jumlahSisi();
        
        b2.inisialisasi("Kotak");
        System.out.println("Nama objek = " + b2.nama);
        b2.jumlahSisi();
        */
        
        Robot rb1 = new Robot();
        Robot rb2 = new Robot();
        Robot rb3 = new Robot();
        
        //rb1.maksimal = 102;
        
        rb1.jumlahRobot();
        rb2.jumlahRobot();
        rb3.jumlahRobot();
    }
    
}
