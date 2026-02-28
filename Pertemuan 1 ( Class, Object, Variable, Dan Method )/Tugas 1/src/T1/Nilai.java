/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1;

/**
 *
 * @author Jaw
 */
public class Nilai {
    String namaMahasiswa, NIM;
    float nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    void setNama(String nama){
        namaMahasiswa = nama;
    }
    void setNIM(String inputNIM){
        NIM = inputNIM;
    }
  
    void Nilai(float absen, float tugas, float uts, float uas){
        nilaiAbsen = absen;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
        nilaiAkhir = (absen * 0.1f) + (tugas * 0.2f) + (uts * 0.3f) + (uas * 0.4f);
    }
    
    void cetakNilai(){
        System.out.println("NIM Mahasiswa     : " + NIM);
        System.out.println("Nama Mahasiswa    : " + namaMahasiswa);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%]   : " + nilaiUTS);
        System.out.println("Nilai UAS [40%]   : " + nilaiUAS);
        System.out.println("Nilai Akhir       : " + nilaiAkhir);
    }
}
