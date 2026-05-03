/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author Jaw
 */
public class Admin extends User {
    private String password;
    
    public Admin (String nama, String noTelp, String password){
        super(nama,noTelp);
        this.password = password;
    }
    
    public String getPass(){
        return password;
    }
}
