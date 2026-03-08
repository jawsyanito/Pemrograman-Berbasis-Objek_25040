/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Jaw
 */
public class SepedaGunung extends Sepeda {
    private int Sadel;
    
    void setSadel(int jumlah){
        Sadel = getGir()- jumlah;
    }
    
    int getSadel(){
        return Sadel;
    }
}
