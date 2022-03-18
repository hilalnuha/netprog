/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba4;

/**
 *
 * @author dewan
 */
class Hewan {
    int kaki;
    String nama;
    
    void namaHewan() {
        System.out.println("Namanya adalah = " + nama);
    }
}

class Burung extends Hewan {
    boolean sayap;
    String makanan;
    String jenis;
    
    void namaHewan() {
        System.out.println("Burung ini berjenis " + jenis + " dengan namanya adalah = " + nama);
    }
    
    void makananBurung() {
        System.out.println("Makanannya adalah = " + makanan);
    }
}

/*class Kucing extends Hewan {
    boolean taring;
    String makanan;
    
    void makananKucing() {
        System.out.println("Makanannya adalah = " + makanan);
    } 
}
*/
public class Coba4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hewan a = new Hewan();
        Burung b = new Burung();
                
        //a.kaki = 0;
        //a.nama = "Bibi";
        //a.namaHewan();
        
        b.kaki = 2;
        b.nama = "Mimi";
        b.makanan = "Biji-bijian";
        b.jenis = "Kakak-tua";
        b.sayap = true;
        b.namaHewan();
        b.makananBurung();
              
    }
    
}
