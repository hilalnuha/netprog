/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba2;

/* Library untuk mencoba ArrayList */
import java.util.ArrayList;

/* Library untuk mengelola File-teks*/
import java.io.File;  // mengimpor Class File
import java.io.FileWriter; // mengimpor Class FileWriter

import java.util.Scanner; // mengimpor Class Scanner
import java.io.IOException;  // Mengimpor Class IOException utk menangani error
import java.io.FileNotFoundException;  // mengimpor Class FileNotFoundException 
/**
 *
 * @author dewan
 */
public class Coba2 {
        //int Var1;
        //static int Var2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Contoh source code untuk mencoba method */
        //int VarC = 10;
        //System.out.println("Is the VarC an odd number? " + isOddNumber(VarC));
        //printMultiple(5, "Trying void method");
        
        /* Source code untuk mencoba tipe data String*/
        // String varString = "Hi, my name is John"; 
        // System.out.println(varString);
        
        String varString1 = "Rendy";
	String varString2 = "rendy";

	if(!varString1.equals(varString2)) {
            System.out.println("Untuk method equals()");
            System.out.println(varString1 + " tidak sama dengan " + varString2);
	}
        System.out.println("\nsedangkan\n");
        if(varString1.equalsIgnoreCase(varString2)) {
            System.out.println("Untuk method equalsIgnoreCase()");
            System.out.println(varString1 + " sama dengan " + varString2);
	}
        
        /* Contoh source code untuk mencoba Array */
        // int nilai[] = new int[5];
        // int ind = 0;
        // nilai[0] = 75; nilai[1] = 80; nilai[2] = 68;
        // nilai[3] = 78; nilai[4] = 85;
        // nilai = minToMax(nilai);

        // for(ind=0; ind<5; ind++) {
        //      System.out.println("Array-" + ind + " = " + nilai[ind]);
        // }
        
        /* Contoh source code untuk mencoba ArrayList */
        // ArrayList<String> strStudent = new ArrayList<String>();
        // ArrayList<Byte> byteStudent = new ArrayList<Byte>();
        // ArrayList<Float> floatStudent = new ArrayList<Float>();
        // ArrayList<Double> doubleStudent = new ArrayList<Double>();
        // ArrayList<Short> shortStudent = new ArrayList<Short>();
        // ArrayList<Integer> studentNum = new ArrayList<Integer>();
        // studentNum.add(123);
        // studentNum.add(124);
        // studentNum.add(125);
        // System.out.println(studentNum);
        // ArrayList<String> strStudent = new ArrayList<String>();
        // strStudent.add("Raja");
        // strStudent.add("Jaka");
        // strStudent.add("Ririn");
        // System.out.println(strStudent);
        
        // System.out.println("Set name on index 1 and add more student names");
        // strStudent.set(1, "Lian");
        // strStudent.add("Dara");
        // strStudent.add("Zeta");
        // strStudent.add("Nina");
        // for(int i=0; i<strStudent.size(); i++) {
        //    System.out.println(strStudent.get(i));
        // }
        
        // System.out.println("Remove student on index 4");
        // strStudent.remove(4) ;
        // System.out.println(strStudent);
        /* Contoh source code untuk membuat File-teks */
        /*
        String namaFile = "Coba1.txt";
        File FileKu = new File(namaFile);
        try {
            if (FileKu.createNewFile()) {
                System.out.println(FileKu.getName() + " dibuat");
            } else {
                System.out.println(namaFile + " telah ada sebelumnya");
            }
        } catch (IOException err) {
            System.out.println("Sebuah error telah terjadi.");
            err.printStackTrace();
        }
        */
        
        /* Contoh source code untuk menuliskan teks ke File-teks */
        /*
        String namaFile = "Coba1.txt";
        try {
            FileWriter TulisFile = new FileWriter(namaFile);
            TulisFile.write("Percobaan menuliskan String ke file-teks");
            TulisFile.close();
            System.out.println("Penulisan ke file-teks berhasil dilakukan");
        } catch (IOException err) {
            System.out.println("Sebuah error telah terjadi.");
            err.printStackTrace();
        }
        */
        
        /* Contoh source code untuk membaca teks dari File-teks */
        /*
        String namaFile = "Coba1.txt";
        File FileKu = new File(namaFile);
        try {
            Scanner BacaFile = new Scanner(FileKu);
            while (BacaFile.hasNextLine()) {
                String teks = BacaFile.nextLine();
                System.out.println(teks);
            }
            BacaFile.close();
        } catch (FileNotFoundException err) {
            System.out.println("Sebuah error telah terjadi.");
            err.printStackTrace();
        }
        */
        
        /* Contoh source code untuk membaca teks dari File-teks */
        /*
        String namaFile = "Coba1.txt";
	File FileKu = new File(namaFile);
	String temp = "";
	try {
            Scanner BacaFile = new Scanner(FileKu);
            while(BacaFile.hasNextLine()) {
                temp += BacaFile.nextLine() + "\n";
            }
            System.out.println(temp);
            BacaFile.close();
	} catch (FileNotFoundException err) {
            System.out.println("Sebuah error telah terjadi.");
            err.printStackTrace();
	}
	temp +=  "Tambahkan 1 baris di akhir \n";
        System.out.println(temp);
	try {
            FileWriter TulisFile = new FileWriter(namaFile);
            TulisFile.write(temp);
            TulisFile.close();
	} catch (IOException err) {
            System.out.println("Sebuah error telah terjadi.");
            err.printStackTrace();
	}	
        */       
        
    }
    
    /* Contoh source code untuk mencoba method */
    static boolean isOddNumber(int in) {
        boolean out = false;
        if(in%2 == 0) {
            out = false;
        } else {
            out = true;
        }
        return out;
    }
    
    static void printMultiple(int n, String str) {
	for(int i = 0; i < n; i++) {
            System.out.println(str);
	}
    }
    
    static int [] minToMax(int [] val) {
        int [] tempVal = new int[val.length];
        
        for(int i=0; i<val.length; i++) {
           tempVal[i] = val[i];
        }
        
        for(int i=1; i<val.length; i++) {
            for(int j=i; j>0; j--) {
                if(tempVal[j] < tempVal[j-1]) {
                    int temp = tempVal[j];
                    tempVal[j] = tempVal[j-1];
                    tempVal[j-1] = temp;
                }
            }
        }
        
        return tempVal;
    }

}

