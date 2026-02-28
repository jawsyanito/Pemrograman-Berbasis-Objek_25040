/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1;

/**
 *
 * @author Jaw
 */
public class MahasiswaBeraksi {
    public static void main (String[] args){
        
        Mahasiswa mahasiswaTerpilih = new Mahasiswa();
            mahasiswaTerpilih.setNama("Johni");
            System.out.print(mahasiswaTerpilih.getNama());
            mahasiswaTerpilih.membaca();
            
            System.out.print(mahasiswaTerpilih.getNama());
            mahasiswaTerpilih.nyontek();
            
            System.out.print(mahasiswaTerpilih.getNama());
            mahasiswaTerpilih.modifikasi();

    }
}
