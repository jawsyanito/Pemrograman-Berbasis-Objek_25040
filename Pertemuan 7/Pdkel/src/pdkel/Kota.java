
package pdkel;
import java.util.Scanner;
/**
 *
 * @author Jaw
 */
public class Kota {
    public static void main(String[]args){
        String[] kota = new String[40];
        Scanner input = new Scanner(System.in);
        int i;
        
        System.out.println("Masukan jumlah data :");
        int jml = input.nextInt();
        
        for (i=0; i < jml ; i++){
            System.out.println("Data ke - " + (i+1));
            System.out.println("Masukan nama kota: ");
            kota[i] = input.next();
        }
        
        System.out.println("\nNama-nama kota :");
        for (i=0; i < jml ; i++){
            System.out.print((i+1)+ ". ");
            System.out.println("Nama Kota : " + kota[i]);
        }
    }
}
