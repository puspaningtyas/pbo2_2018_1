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
public class Dokter {
    private String nomorPegawai, nama, alamat, tempatLahir;//Pendeklarasian variabel bertipe data String
    private int tanggalLahir; //Pendeklarasian variabel bertipe data integer
    
    public Dokter(){ //menambahkan konstruktor, Konsktruktor adalah method yang memiliki nama yang sama dengan nama kelas
        
    }

    public String getNomorPegawai() {//membuat method baru yang akan mereturn variabel bertipe data String
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {//membuat method baru yang digunakan untuk memasukkan data dari parameter nomorPegawai kedalam variabel nomorPegawai
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {//membuat method baru yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) {//membuat method baru yang digunakan untuk memasukkan data dari parameter nama kedalam variabel nama
        this.nama = nama;
    }

    public String getAlamat() {//membuat method baru yang akan mereturn variabel bertipe data String
        return alamat;
    }

    public void setAlamat(String alamat) {//membuat method baru yang digunakan untuk memasukkan data dari parameter alamat kedalam variabel alamat
        this.alamat = alamat;
    }

    public String getTempatLahir() {//membuat method baru yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {//membuat method baru yang digunakan untuk memasukkan data dari parameter tempatLahir kedalam variabel tempatLahir
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {//membuat method baru yang akan mereturn variabel bertipe data integer
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {//membuat method baru yang digunakan untuk memasukkan data dari parameter tanggalLahir kedalam variabel tanggalLahir
        this.tanggalLahir = tanggalLahir;
    }
}
