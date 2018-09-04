/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Satrio
 */
public class Klinik {
    private String idKlinik, nama;//Pendeklarasian variabel bertipe data String

    public String getIdKlinik() {//membuat method baru yang akan mereturn variabel bertipe data String
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {//membuat method baru yang digunakan untuk memasukkan data dari parameter idKlinik kedalam variabel idKlinik
        this.idKlinik = idKlinik;
    }

    public String getNama() {//membuat method baru yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) { //membuat method baru yang digunakan untuk memasukkan data dari parameter nama kedalam variabel nama
        this.nama = nama;
    }
}
