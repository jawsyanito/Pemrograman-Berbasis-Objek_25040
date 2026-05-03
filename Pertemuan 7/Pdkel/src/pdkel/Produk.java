package pdkel;
import java.util.ArrayList;

public class Produk {
    int id;
    String nama;
    double harga;
    
    Produk(int id, String nama, double harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    
    public String toString(){
        return String.format("ID: %d | Nama: %-10s | Harga: Rp%,.2f", id, nama, harga);
    }
}
   