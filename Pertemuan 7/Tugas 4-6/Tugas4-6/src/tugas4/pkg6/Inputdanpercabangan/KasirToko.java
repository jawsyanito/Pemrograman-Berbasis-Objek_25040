package tugas4.pkg6.Inputdanpercabangan;

import java.util.Scanner;

public class KasirToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double totalBelanja;
        int pilihan;
        
        System.out.print("Masukkan nama pelanggan               : ");
        nama = input.nextLine();

        System.out.print("Masukkan total belanja sebelum diskon : ");
        totalBelanja = input.nextDouble();

        System.out.println("\n=== PILIH KATEGORI MEMBER ===");
        System.out.println("1. Regular  : Diskon 0%");
        System.out.println("2. Silver   : Diskon 10%");
        System.out.println("3. Gold     : Diskon 20%");
        System.out.println("4. Platinum : Diskon 30%");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();

        String kategori;
        double diskonPersen;

        switch (pilihan) {
            case 1:
                kategori = "Regular";
                diskonPersen = 0;
                break;

            case 2:
                kategori = "Silver";
                diskonPersen = 10;
                break;

            case 3:
                kategori = "Gold";
                diskonPersen = 20;
                break;

            case 4:
                kategori = "Platinum";
                diskonPersen = 30;
                break;

            default:
                kategori = "Tidak Dikenal";
                diskonPersen = 0;
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan");
        }

        double potonganDiskon = totalBelanja * diskonPersen / 100;
        double totalSetelahDiskon = totalBelanja - potonganDiskon;

        String metodePembayaran;

        if (totalSetelahDiskon < 50000) {
            metodePembayaran = "Wajib Tunai";
        } else if (totalSetelahDiskon >= 50000 && totalSetelahDiskon < 200000) {
            metodePembayaran = "Bisa Tunai / Transfer";
        } else {
            metodePembayaran = "Bisa Tunai / Transfer / Kartu Kredit";
        }

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Pelanggan        : " + nama);
        System.out.println("Kategori Member       : " + kategori);
        System.out.println("Total Sebelum Diskon  : Rp " + totalBelanja);
        System.out.println("Potongan Diskon       : Rp " + potonganDiskon);
        System.out.println("Total Setelah Diskon  : Rp " + totalSetelahDiskon);
        System.out.println("---------------------------");
        System.out.println("Metode Pembayaran     : " + metodePembayaran);

    }
}