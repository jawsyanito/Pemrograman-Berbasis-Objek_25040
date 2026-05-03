/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktekdikelas;

/**
 *
 * @author Jaw
 */
public class Jalankan {
    public static void main(String[] args){
        Circle lingkaran1 = new Circle(2,2);
        Circle lingkaran2 = new Circle(4,1,2);
        
        
        System.out.println("Luas L2 = " + lingkaran2.luas());
        System.out.println("Keliling L1 = " + lingkaran1.keliling());
        
        Employee orang1 = new Employee("Lucy", 100000);
        Manager orang2 = new Manager ("Dadang", 200000, "HR");
    
        System.out.println("\nData orang 1 :\n" + orang1.getDetails());
        System.out.println("\nData orang 2 :\n" + orang2.getDetails());
        
    }
}
