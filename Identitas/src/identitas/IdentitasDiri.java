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
public class IdentitasDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Identitas diri = new Identitas ();
        diri.setJurusan("Jurusan = TI-AEU");
        diri.setKelas("Kelas = 1CC10");
        diri.setKelas_komandro("Kelas Komandro = WEB");
        diri.setNama("Adrian");
        diri.setTempatTanggalLahir("TTL = Jakarta 15 Agustus 2001");
        diri.setUmur(18);
      
        System.out.println(diri.getNama());
        System.out.println(diri.getKelas());
        System.out.println(diri.getTempatTanggalLahir());
        System.out.println(diri.getUmur());
        System.out.println(diri.getKelas_komandro());
        System.out.println(diri.getJurusan());
        
        
    }
    
}
