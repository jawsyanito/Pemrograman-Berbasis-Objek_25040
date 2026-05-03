/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikdiklas;

/**
 *
 * @author Jaw
 */
public class TesFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Looping untuk for
        
//        for (int i = 1; i <= 5; i++){
//            System.out.println("Nilai ke - " + i);
//        }
        
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        for(int angka : numbers){
//            System.out.println("Nilai ke - " + angka);
//        }
        
//        Segitiga kecil = new Segitiga(5);
//        System.out.println(kecil.gambarSegitiga());

        // Looping untuk while
        int i = 1;
        
        while (i <= 10){
            System.out.println("Nilai ke - " + i);
            if ((i+1) % 2 == 0){
                i += 2;
            }
            else {
                i ++;
            }
        }
    }
    
}
