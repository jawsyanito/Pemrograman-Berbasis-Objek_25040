<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas23;

/**
 *
 * @author Jaw
 */
public class Knight extends Entity {
    private double defense;
    
    public Knight(String nama, double hp, double attack, double defense){
        super(nama, hp, attack);
        this.defense = defense;
    }
    
    public void infoStatus(){
        super.infoStatus();
        System.out.println("Defense: " + defense);
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas23;

/**
 *
 * @author Jaw
 */
public class Knight extends Entity {
    private double defense;
    
    public Knight(String nama, double hp, double attack, double defense){
        super(nama, hp, attack);
        this.defense = defense;
    }
    
    public void infoStatus(){
        super.infoStatus();
        System.out.println("Defense: " + defense);
    }
    
}
>>>>>>> e10f1ab59fd95d3ab1fb86d7c35107f108e9e4dd
