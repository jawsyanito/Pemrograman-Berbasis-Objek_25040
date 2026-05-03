
package tugas4.pkg6.looparray;

/**
 *
 * @author Jaw
 */
import java.util.ArrayList;

public class TokoSerbaAda {

    ArrayList<Barang> katalog = new ArrayList<>();

    public TokoSerbaAda() {
        katalog.add(new Barang("a001", "Buku", 3000));
        katalog.add(new Barang("a002", "Pensil", 4000));
        katalog.add(new Barang("a003", "Pulpen", 5000));
        katalog.add(new Barang("a004", "Penghapus", 2000));
        katalog.add(new Barang("a005", "Penggaris", 3500));
    }

    public Barang cariBarang(String kode) {
        for (Barang barang : katalog) {
            if (barang.getKode().equals(kode)) {
                return barang;
            }
        }
        return null;
    }
}