/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Acer
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        // hitung luas total
        double luasTotal = (Persegi.hitungLuas(42)) + (2 * (Lingkaran.hitungLuas(21)));
        System.out.println("Luas totalnya adalah: " + luasTotal);
    }
    
}
