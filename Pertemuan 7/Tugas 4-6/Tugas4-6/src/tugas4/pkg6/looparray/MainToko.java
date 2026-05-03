package tugas4.pkg6.looparray;
import java.util.Scanner;

public class MainToko {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();

        System.out.println("=== KATALOG BARANG ===");
        for (Barang barang : toko.katalog) {
            barang.infoBarang();
        }

        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = input.nextInt();
        input.nextLine();

        Barang[] belanjaBarang = new Barang[jumlahItem];
        int[] belanjaJumlah = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("\nItem ke-" + (i + 1));
            System.out.print("Masukkan kode barang : ");
            String kode = input.nextLine();

            Barang barang = toko.cariBarang(kode);

            if (barang == null) {
                System.out.println("Kode barang tidak ditemukan!");
                continue;
            }

            System.out.print("Masukkan jumlah beli : ");
            int jumlah = input.nextInt();
            input.nextLine();

            belanjaBarang[i] = barang;
            belanjaJumlah[i] = jumlah;
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("======================================================================");
        System.out.printf(
            "%-3s %-12s %-15s %-10s %-13s %-15s\n",
            "No", "Kode Barang", "Nama Barang",
            "Harga", "Jumlah Beli", "Jumlah Bayar"
        );
        System.out.println("======================================================================");

        int totalBayar = 0;
        int no = 1;

        for (int i = 0; i < jumlahItem; i++) {

            if (belanjaBarang[i] != null) {

                int subtotal =
                    belanjaBarang[i].getHarga() * belanjaJumlah[i];

                System.out.printf(
                    "%-3d %-12s %-15s %-10d %-13d %-15d\n",
                    no,
                    belanjaBarang[i].getKode(),
                    belanjaBarang[i].getNama(),
                    belanjaBarang[i].getHarga(),
                    belanjaJumlah[i],
                    subtotal
                );

                totalBayar += subtotal;
                no++;
            }
        }

        System.out.println("======================================================================");
        System.out.printf("Total Bayar : %d\n", totalBayar);
        System.out.println("======================================================================");
    }
}