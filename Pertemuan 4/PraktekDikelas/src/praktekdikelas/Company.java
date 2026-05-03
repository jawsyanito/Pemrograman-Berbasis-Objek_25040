/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktekdikelas;

/**
 *
 * @author Jaw
 */
public class Company {
    public static void main(String[] args){
        Employee orang1 = new Employee("Lucy", 100000);
        Manager orang2 = new Manager ("Dadang", 200000, "HR");
    
        System.out.println("Data orang 1 :\n" + orang1.getDetails());
        System.out.println("\nData orang 2 :\n" + orang2.getDetails());
    }
}
