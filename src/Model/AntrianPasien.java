/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Satrio
 */
public class AntrianPasien {
    private int tanggalAntrian, bulanAntrian, tahunAntrian; //Pendeklarasian variabel bertipe data integer
    private Klinik klinik; //Pendeklarasian variabel bertipe data Klinik 
    private Pasien daftarPasien[]; // pendeklarasian array bertipe data pasien 

    public Klinik getKlinik() {//membuat method baru yang akan mereturn variabel bertipe data klinik
        return klinik;
    }

    public void setKlinik(Klinik klinik) {//membuat method baru yang digunakan untuk memasukkan data dari parameter klinik kedalam variabel klinik
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {//membuat method baru yang akan mereturn variabel bertipe data aray pasien
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {//membuat method baru yang digunakan untuk memasukkan data dari parameter daftarPasien kedalam variabel daftarPasien
        this.daftarPasien = daftarPasien;
    }
}
