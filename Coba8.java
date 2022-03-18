/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba8;

/**
 *
 * @author dewan
 */
class Orang {
    private String id = "1010";
    private String nama = "Budi";
    
    void setID(String idty) {
        id = idty;
    }
    
    void setNama(String nm) {
        nama = nm;
    }
    
    String getID() {
        return id;
    }
    
    String getNama() {
        return nama;
    }
}

class Dosen {
    Orang or = new Orang();
    private String mk = "Alpro";
    
    void setMK(String mk) {
        this.mk = mk;
    }
    
    String getMK() {
        return mk;
    }
}
public class Coba8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen ds = new Dosen();
        
        ds.setMK("PBO");
        ds.or.setID("14830031");
        ds.or.setNama("Hariawan");
        
        System.out.println("Nama dosen = " + ds.or.getNama());
        System.out.println("No Induk = " + ds.or.getID());
        System.out.println("MK = " + ds.getMK());
    }
    
}
