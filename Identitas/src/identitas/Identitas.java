/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identitas;

/**
 *
 * @author lenovo
 */
public class Identitas {
     
       private String Nama,TempatTanggalLahir,Jurusan,Kelas,kelas_komandro;
       private int umur;

    public String getNama() {
        return " Mr " + Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTempatTanggalLahir() {
        return TempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String TempatTanggalLahir) {
        this.TempatTanggalLahir = TempatTanggalLahir;
    }

    public String getJurusan() {
        return  Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getKelas_komandro() {
        return kelas_komandro;
    }

    public void setKelas_komandro(String kelas_komandro) {
        this.kelas_komandro = kelas_komandro;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

  
  
}
