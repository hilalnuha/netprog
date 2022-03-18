/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba9;

class Persegi {
    
    int luas (int r) throws ArithmeticException {
        int temp = 0;
        
        if (r <= 0) {
            throw new ArithmeticException("nilai r tidak boleh kurang dari sama dengan 0");
        } else {
            temp = r * r;
        }
        return temp;
    }
}
/**
 *
 * @author dewan
 */
public class Coba9 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 0; int b = 0; double c = 9;
        
        //c=a/b;
        /*
        try {
            c = a/b;
            
        } catch (ArithmeticException e) {
        
            System.out.println("Berikut adalah eksepsi " + e);
        }    
        System.out.println("Nilai c = " + c);
        */
        /*
        try {
            System.out.println("Di dalam blok try");
            c = a/b;
        } catch (Exception e) {
            System.out.println("Berikut adalah eksepsi " + e);
        } finally {
            System.out.println("Di dalam blok finally");
        }
        System.out.println("Nilai c = " + c);
        */
        /*
        int x = 25; int y = 10;
        
        if(x==25) {
            throw new ArithmeticException("Masukan tidak boleh sama dengan 25");
        } else {
            y = y/(x-25);
        }
        System.out.println("Nilai y = " + y);
        */
        
        /*
        int r = 0;
        Persegi p = new Persegi();
        
        try {
            p.luas(r);
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        */
        
        int [] arrint = new int[4];
        int idx = 0;
        
        try {
            for(idx=0; idx<4; idx++) {
                arrint[idx] = 2 * idx;
            }
            arrint[idx] = arrint[idx] / 0;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        //} catch (ArithmeticException e) { 
        //    System.out.println(e);
        }
    }
    
}
