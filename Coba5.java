/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba5;

/**
 *
 * @author dewan
 */

abstract class Mahasiswa {
    abstract void aktivitas();    
}

class MahasiswaTelkomUniv extends Mahasiswa {
    MahasiswaTelkomUniv() {
        System.out.println("Saya Mahasiswa Fakultas Teknik Elektro");
    } 
    
    //@Override
    void aktivitas() {
        System.out.println("Aktivitas: Kuliah, riset, dan aktif dalam organisasi kemahasiswaan");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

interface  Matkul {
    void kodeMK();
    void deskripsiMK();    
}

interface  Dosen {
    void kodeDosen();
    void deskripsiDosen();    
}

abstract class MKTahun1 implements Matkul {
    abstract void kontenMKTahun1();
}

class Alpro extends MKTahun1 {
    
    void kontenMKTahun1() {
        System.out.println("Konten MK Tahun-1 adalah Alpro, Kalkulus 1 dan 2, Fisika 1 dan 2, serta HEI");
    }

    public void kodeMK() {
        System.out.println("Kode MK = TTI3V3");
    }

    public void deskripsiMK() {
        System.out.println("Deskripsi = MK yang mempelajari algoritma dan pemrograman dengan bahasa C");
    }
}

class MobApp implements Matkul, Dosen {

    public void kodeMK() {
        System.out.println("Kode MK = TTI7V3");
    }

    public void deskripsiMK() {
        System.out.println("Deskripsi = MK yang mempelajari pembuatan Mobile Applications");
    }

    public void kodeDosen() {
        System.out.println("Kode Dosen = FAV");
    }

    public void deskripsiDosen() {
        System.out.println("Deskripsi = selain mengampu MobApp, FAV juga mengampu PBO dan Alpro");
    }
    
}
class PBO implements Matkul {
    PBO() {
        System.out.println("Selamat datang di Mata Kuliah Pemrograman Berbasis Objek");
    }
    
    public void kodeMK() {
        System.out.println("Kode MK = TTI6V2");
    }
    public void deskripsiMK() {
        System.out.println("Deskripsi = MK yang mempelajari pemrograman berbasis objek dengan bahasa Java");
    }
}
public class Coba5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Mahasiswa m = new Mahasiswa();
        // MahasiswaTelkomUniv m1 = new MahasiswaTelkomUniv();
        // m1.aktivitas();
        // PBO mk1 = new PBO();
        // mk1.kodeMK();
        // mk1.deskripsiMK();
        
        Alpro mk2 = new Alpro();
        mk2.kontenMKTahun1();
        mk2.kodeMK();
        mk2.deskripsiMK();
        
        //MobApp mk3 = new MobApp();
        //mk3.kodeMK();
        //mk3.deskripsiMK();
        //mk3.kodeDosen();
        //mk3.deskripsiDosen();
    }
    
}
