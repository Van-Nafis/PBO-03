/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author Acer
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // menghitung luas lingkaran besar
        double setLingkaran = Lingkaran.hitungLuas(14) * 1 / 2;
        
        // menghitung luas lingkaran kecil
        double lingkaran = Lingkaran.hitungLuas(7);
        
        // menghitung luas daerah abu-abu
        double luasTotal = setLingkaran - lingkaran;
        System.out.println("Luas daerah abu-abu adalah: " + luasTotal);

    }
    
}
