package pdkel;
import java.util.ArrayList;

public class SistemGudang {
    public static void main(String[]args){
        ArrayList<Produk> listProduk = new ArrayList<>();
        
        Produk barangPertama = new Produk(101, "Laptop", 15000000);
        listProduk.add(barangPertama);
        listProduk.add(new Produk(102, "Monitor", 1000000));
        listProduk.add(new Produk(103, "Mouse", 10000));
        
        if(listProduk.size() > 1){
            listProduk.get(1).harga = 3000000;
        }
        
        System.out.println("=== LAPORAN STOK GUDANG ===");
        double totalAsset = 0;
        
        for (Produk p : listProduk){
            System.out.println(p);
            totalAsset += p.harga;
        }
        
        listProduk.removeIf(p -> p.id == 101);
        
        System.out.printf("\nTotal Nilai aset : Rp%,.2f%n", totalAsset);
        System.out.println("Sisa jenis barang: " + listProduk.size());
    
    }
}        
