/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T1;

/**
 *
 * @author Jaw
 */
public class Mahasiswa {
    String namaMahasiswa;

    void setNama(String nama){
        namaMahasiswa = nama;
    }
    String getNama(){
        return namaMahasiswa;
    }
    
    public void membaca(){
        System.out.println(" Sedang Membaca");
    }
    public void nyontek(){
        System.out.println(" Sedang Menyontek");
    }
    public void modifikasi(){
        System.out.println(" Sedang Memodifikasi kode programnya");
    }
}
