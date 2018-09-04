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
public class Pasien {
    private String noRekamMedis, nama, alamat, tempatLahir;
    private int tanggalLahir, bulanLahir, tahunLahir;
    
    public Pasien(){
        
    }
    

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException {
        if (noRekamMedis.toCharArray().length>=6) {
            this.noRekamMedis = noRekamMedis;
        }else{
                throw new NumberFormatException("Nomor Rekam Medis Salah");
                }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception(" Tanggal Lahir Anda Tidak Valid ");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahir Anda Tidak Valid ");
        }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception(" Tahun Lahir Anda Tidak Valid ");
        }
    }
}
