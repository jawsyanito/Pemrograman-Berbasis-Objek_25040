package tugas4.pkg6.Polymorph;

import tugas4.pkg6.Polymorph.Kendaraan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;
    
    public Mobil(String merk, int kecepatanMaksimal, int jumlahPintu){
    super(merk, kecepatanMaksimal);
    this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void gerakkan() {
        System.out.println("Mobil " + merk + " melaju di jalan raya\n");
    }

    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu    : " + jumlahPintu);
    }
}
