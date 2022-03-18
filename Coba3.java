/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba3;

/**
 *
 * @author dewan
 */
class Kalender {
    int tahun;
    String bulan;
    int tanggal;
    
    Kalender() {
        System.out.println("Selamat… Anda telah membuat objek dari kelas Kalender. ");
	System.out.println("Silahkan melanjutkan dengan memberikan nilai pada variabel tahun, bulan, dan tanggal. ");
    }

    Kalender(int th) {
        tahun = th;
	System.out.println("Selanjutnya berilah nilai pada variabel bulan dan tanggal.");
    }
    
    Kalender(int th, String bl, int tgl) {
        tahun = th;
        bulan = bl;
        tanggal = tgl;
        System.out.println("Semua variabel telah terisi nilai.");
    }
    void printKalender() {
	System.out.println("Isi kalender = " + tanggal + " " + bulan + " " + tahun);
    }
}	


public class Coba3 {

    public static void main(String[] args) {
	// Kalender kal = new Kalender();
	// kal.tahun = 2021;
	// kal.bulan = "November";
	// kal.tanggal = 19;
	// Kalender kal = new Kalender(2021, "November", 24);
        
	// System.out.println("Tahun = " + kal.tahun);
	// System.out.println("Bulan = " + kal.bulan);
	// System.out.println("Tanggal = " + kal.tanggal);
        
        // kal.printKalender();
        
        Kalender kal1 = new Kalender();
        System.out.println("==========");
        Kalender kal2 = new Kalender(2021);
        System.out.println("==========");
        Kalender kal3 = new Kalender(2021, "November", 17);
        
    }

}
