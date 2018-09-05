/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSuperVisor;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pasien;

/**
 *
 * @author admin
 */
public class Testpasien {
    public static void main(String[] args) {
        Pasien test = new Pasien();
        test.setNama("Puspa");
        try {
            test.setBulanLahir(12);
            System.out.println("bulan = "+test.getBulanLahir());
        } catch (Exception ex) {
            Logger.getLogger(Testpasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Pasien test1 = new Pasien();
        test1.setNama("Adi");
        try {
            test1.setBulanLahir(13);
            System.out.println("bulan = "+test1.getBulanLahir());
        } catch (Exception ex) {
            Logger.getLogger(Testpasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
