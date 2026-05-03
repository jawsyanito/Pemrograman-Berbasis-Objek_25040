/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktekdikelas;

/**
 *
 * @author Jaw
 */
public class Manager extends Employee {
    private String dept;
    
    public Manager (String name, double salary, String dept){
        super(name,salary);
        this.dept = dept;
    }
    
    public String getDept(){
        return dept;
    }
    
    public String getDetails(){
        return super.getDetails()+"\nDepattement = " + getDept();
    }
    
    public void cetak(){
        System.out.println("Percobaan dikelas Manager");
    }
}
