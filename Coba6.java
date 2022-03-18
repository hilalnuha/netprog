/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba6;

/**
 *
 * @author dewan
 */

class Robot {
    private String password;
    public String nama;
    protected String jenis;

    Robot(String nm, String jns) {
        password = "robotku123";
        nama = nm;
        jenis = jns;
    }
    
    String getPassword() {
        return password;
    }
    
    void setPassword(String pass) {
        password = pass;
    }
}

public class Coba6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Robot rb1 = new Robot("Andro1", "Android");
        System.out.println(rb1.nama);
        System.out.println(rb1.jenis);
        System.out.println(rb1.getPassword());
        //System.out.println(rb1.password);
    }
    
}
