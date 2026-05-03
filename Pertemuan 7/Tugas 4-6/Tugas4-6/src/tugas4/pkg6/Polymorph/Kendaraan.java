package tugas4.pkg6.Polymorph;

public abstract class Kendaraan {
    protected String merk;
    protected int kecepatanMaksimal;
    
    public Kendaraan(String merk, int kecepatanMaksimal){
        this.merk = merk;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }
    
    public abstract void gerakkan();
    public void infoKendaraan(){
        System.out.println("Merk   : " + merk);
        System.out.println("Kecepatan Maks   : " + kecepatanMaksimal);
    }
}
