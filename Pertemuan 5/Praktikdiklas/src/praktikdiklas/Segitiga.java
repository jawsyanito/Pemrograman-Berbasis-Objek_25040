/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikdiklas;

/**
 *
 * @author Jaw
 */
public class Segitiga {
    private final int lebar;
    
    public Segitiga (int lebar){
        this.lebar = lebar;
    }
    
    public String gambarSegitiga(){
        String temp = "";
        
        for (int i = 1; i <=lebar;i++){
            for (int j = 1; j <=i; j++){
                temp += "[]";
            }
            temp += '\n';
        }
        return temp;
    }
}
