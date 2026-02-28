/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Jaw
 */
public class PersegiPanjang {
    int panjang, lebar;
    
        public PersegiPanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }
        
        public void info(){
            System.out.println("Panjang persegi panjang : " + panjang);
            System.out.println("Lebar persegi panjang : " + lebar);
        }
}
