/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Jaw
 */
public class LampuBeraksi {
    public static void main (String[] args){
        Lampu lampuKamar = new Lampu();
        
        System.out.println("Status lampu saat ini : Mati");
        
        lampuKamar.hidupkan();
        lampuKamar.matikan();
    }
}
