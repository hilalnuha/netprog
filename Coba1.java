/*
 * Source code berikut ini digunakan pada bahasan BAB 1.
 * Silahkan menghilangkan tanda 
 */
package coba1;
/**
 *
 * @author dewan
 */
public class Coba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Berikut ini kode untuk hello world, jika tidak diperlukan bisa
         * di-comment kembali agar tidak terlalu banyak output yang muncul
         */
        /* 
        System.out.print("Hello World\t");
        System.out.print("Selamat pagi\n");
        System.out.print("Saya Budi");
        */
        
        /* Berikut ini kode untuk tipe data dan penggunaannya, jika 
         * tidak diperlukan bisa di-comment kembali agar tidak terlalu 
         * banyak output yang muncul
         */
        /* 
        short a = 10;
        float b = 15;
        boolean c = false;
        char d = 'J';
        System.out.print("Nilai a = " + a);
        System.out.print("Nilai b = " + b);
        System.out.print("Nilai c = " + c);
        System.out.print("Nilai d = " + d);
        */
        
        /* Berikut ini kode untuk operator aritmatika dan penggunaannya, jika 
         * tidak diperlukan bisa di-comment kembali agar tidak terlalu 
         * banyak output yang muncul
         */
        /* 
        short a = 4; int a2 = 3; byte a3 = 17;
        float b = 15; double b2 = 28.00;
        boolean c = false; 
        char d = 'J';
        a2 = a + a3;
        System.out.println("Nilai a2 = " + a2);
        System.out.println("Nilai a2++ = " + a2++); //21+1
        System.out.println("Nilai a2 = " + a2);
        System.out.println("Nilai --a = " + --a); //4-1
        b2 = b/b2;
        System.out.println("Nilai b2 = " + b2);
        System.out.println("Nilai ++b = " + ++b); //15.0+1
        */
        /*
        a = a2 - a3; // a = 22 - 17
        a2 = b + 2; // a2 = 16 + 2
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai a2 = " + a2);
        */
        
        /* Berikut ini kode untuk operator biner dan penggunaannya, jika 
         * tidak diperlukan bisa di-comment kembali agar tidak terlalu 
         * banyak output yang muncul
         */
        /* 
        int f = 21; byte g = 37; 
        
        //System.out.println("Nilai f = " + f);
        //System.out.println("Nilai f dalam biner = " + Integer.toBinaryString(f));
        System.out.println("Nilai f & g = " + (f&g));
        System.out.println("Nilai f | g = " + (f|g));
        System.out.println("Nilai f ^ g = " + (f^g));
        System.out.println("Nilai f >> 2 = " + (f>>2));
        System.out.println("Nilai f << 2 = " + (f<<2));
        System.out.println("Nilai ~g = " + ~g);
        */
        
        /* Berikut ini kode untuk operator boolean dan relasional serta  
         * penggunaannya, jika tidak diperlukan bisa di-comment kembali agar  
         * tidak terlalu banyak output yang muncul
         */
        /* 
        boolean a = false; boolean b = true; 
        int c = 17; int d = 31;
        
        System.out.println("Nilai a AND b = " + (a && b)); // false
        System.out.println("Nilai a OR b = " + (a || b)); // true
        System.out.println("Nilai NOT a AND b = " + (!a && b)); //true
        System.out.println("c lebih dari d? " + (c > d)); //false
        System.out.println("c kurang dari sama dengan d? " + (c <= d)); //true
        System.out.println("c sama dengan d? " + (c == d)); //false
        System.out.println("c tidak sama dengan d? " + (c != d)); //true
        */
        
        /* Berikut ini kode untuk pemrograman kondisional if-else serta  
         * penggunaannya, jika tidak diperlukan bisa di-comment kembali agar  
         * tidak terlalu banyak output yang muncul
         */
        /*
        int suhu = 35; int batas = 30;
        int batas1 = 25; int batas2 = 40;
        int kelembaban = 75;
        boolean kipas_ON = false;
        */
//        if(suhu > batas) {
//            kipas_ON = true;
//        } else {
//            kipas_ON = false;
//        }
//        System.out.println("kipas menyala = " + kipas_ON);
        /*
        if((suhu > batas1) && (suhu < batas2)) {
            if(kelembaban > 80) {
                kipas_ON = true;
            } else {
                kipas_ON = false;
            }
        } else {
            kipas_ON = false;
        }
        System.out.println("kipas menyala = " + kipas_ON);
        */
        
        /* Berikut ini kode untuk pemrograman kondisional switch-case serta  
         * penggunaannya, jika tidak diperlukan bisa di-comment kembali agar  
         * tidak terlalu banyak output yang muncul
         */
        /* Dalam contoh ini kita definisikan dahulu nilai yang 
         * berkorelasi dengan masing-masing hari, yakni:
         * Minggu = 0; Senin = 1; Selasa = 2; Rabu = 3; Kamis = 4; 
         * Jumat = 5; Sabtu = 6;
        */ 
        /*
        int hari = 10;
        switch(hari) {
            case 0: System.out.println("Bersepeda"); break;
            case 1: System.out.println("Berlari"); break;
            case 2: System.out.println("Berenang"); break;
            case 3: System.out.println("Tenis"); break;
            case 4: System.out.println("Badminton"); break;
            case 5: System.out.println("Futsal"); break;
            case 6: System.out.println("Bola Basket"); break;
            default: System.out.println("Tidak olahraga"); break;
        }
        */
        
        /* Berikut ini kode untuk pemrograman looping while serta  
         * penggunaannya, jika tidak diperlukan bisa di-comment kembali agar  
         * tidak terlalu banyak output yang muncul
         */
        /*
        int batas = 13; int bulan = 1;
        int batas_hari = 8; int hari = 1;
        */
        /*
        while(bulan<batas) {
            System.out.println("Bulan ke-" + bulan);
            bulan++;
        }
        */
        /*
        while(bulan<batas) {
            System.out.print("Bulan ke-" + bulan + ": ");
            hari = 1;
            while(hari < batas_hari) {
                System.out.print("Hari ke-" + hari + "; ");
                hari++;
            }
            System.out.print("\n");
            bulan++;
        }
        */
        
        /* Berikut ini kode untuk pemrograman looping for serta  
         * penggunaannya, jika tidak diperlukan bisa di-comment kembali agar  
         * tidak terlalu banyak output yang muncul
         */
        int max = 10; int i = 1; int y = 1;
        for(i=1; i<=max; i++) {
            for(y=1; y<=i; y++) {
                System.out.print("*");    
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
