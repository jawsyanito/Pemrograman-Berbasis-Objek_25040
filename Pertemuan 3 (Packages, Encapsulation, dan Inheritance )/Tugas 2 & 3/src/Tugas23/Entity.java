/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas23;

/**
 *
 * @author Jaw
 */
public class Entity implements InterfaceEntity {
    private String nama;
    private double hp;
    private double attack;
    
    public Entity (String nama, double hp, double attack){
        this.nama = nama;
        this.hp = hp + BASE_HP;
        this.attack = attack + BASE_ATTACK;
    }
    
    public void infoStatus(){
        System.out.println("Nama   : " + nama);
        System.out.println("Hp     : " + hp);
        System.out.println("Attack : " + attack);
    }
}
