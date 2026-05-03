
package tugas4.pkg6.Polymorph;

import tugas4.pkg6.Polymorph.Kendaraan;

public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil("Toyota Avanza", 160, 4);
        Kendaraan k2 = new Motor("Honda CBR", 200, "4-Tak");
        k1.infoKendaraan();
        k1.gerakkan();
        k2.infoKendaraan();
        k2.gerakkan();
    }
    
}
