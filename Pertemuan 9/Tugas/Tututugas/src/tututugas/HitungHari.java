package tututugas;

public class HitungHari {
    
    public int hitung(int tahun, String bulan) {
        int jumlahHari = 0;
        
        switch (bulan.toLowerCase()) {
            case "januari":
            case "maret":
            case "mei":
            case "juli":
            case "agustus":
            case "oktober":
            case "desember":
                jumlahHari = 31;
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                jumlahHari = 30;
                break;
            case "februari":
                // Cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
        }
        return jumlahHari;
    }
}