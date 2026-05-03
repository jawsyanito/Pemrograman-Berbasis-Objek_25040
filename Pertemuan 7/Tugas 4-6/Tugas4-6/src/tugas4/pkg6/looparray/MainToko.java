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

        System.out.println("\n=== STRUK BELANJA ===");

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {

            if (belanjaBarang[i] != null) {

                int subtotal = belanjaBarang[i].getHarga() * belanjaJumlah[i];

                System.out.println(
                    belanjaBarang[i].getNama() +
                    " x " + belanjaJumlah[i] +
                    " = " + subtotal
                );

                totalBayar += subtotal;
            }
        }

        System.out.println("----------------------");
        System.out.println("Total Bayar = " + totalBayar);
    }
}