/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Jaw
 */
public class Lampu implements InterfaceLampu {
    int statusLampu;
    
    public void hidupkan(){
        if (statusLampu == KEADAAN_MATI){
            statusLampu = KEADAAN_HIDUP;
 
            System.out.println("Lampu mati, Nyalakan");
            System.out.println("Lampu sudah hidup");
        }
    }
    
    public void matikan(){
        if (statusLampu == KEADAAN_HIDUP){
            statusLampu = KEADAAN_MATI;
 
            System.out.println("Lampu hidup, Matikan");
            System.out.println("Lampu sudah mati");
        }
        
        
    }
}
