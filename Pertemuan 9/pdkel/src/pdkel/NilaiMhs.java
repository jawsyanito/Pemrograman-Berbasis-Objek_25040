/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdkel;

/**
 *
 * @author Jaw
 */
public class NilaiMhs {
  double tm, uas, uts, rata; char grade;
    
    double nilaiRata(){
        rata = (tm+uts+uas)/3;
        return rata;
    }
}
