package tugas4.pkg6.Polymorph;

import tugas4.pkg6.Polymorph.Kendaraan;

/**
 *
 * @author Jaw
 */
public class Motor extends Kendaraan{
    private String jenisMesin;
    
    public Motor(String merk, int kecepatanMaksimal, String jenisMesin){
    super(merk, kecepatanMaksimal);
    this.jenisMesin = jenisMesin;
    }
    
    @Override
    public void gerakkan() {
        System.out.println("Mobil " + merk + " melaju di jalan raya!");
    }

    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
    
}
