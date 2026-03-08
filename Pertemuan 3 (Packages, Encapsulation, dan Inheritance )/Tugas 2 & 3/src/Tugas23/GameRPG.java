/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas23;

/**
 *
 * @author Jaw
 */
public class GameRPG {
    public static void main (String[] args){
        Entity player = new Entity("Marsha",200,600);
        player.infoStatus();
        
        System.out.println("             ");
        
        Knight knight = new Knight("Sentinel",500,400,200);
        knight.infoStatus();
    }
}
