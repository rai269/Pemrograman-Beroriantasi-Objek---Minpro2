
package Service;
import java.util.ArrayList;
import java.util.Scanner;
import Model.Model;

public class Service {
    static Scanner Scanner = new Scanner(System.in);
        static ArrayList<Model> daftarTiket = new ArrayList<>();
    
    public static void menuUtama() {
        System.out.println("\n======= SELAMAT DATANG DI SISTEM TIKETPLANE ========");
        System.out.println("1. Lihat Daftar Tiket");
        System.out.println("2. Tambah Tiket Baru");
        System.out.println("3. Edit Tiket");
        System.out.println("4. Hapus Tiket");
        System.out.println("5. Cari Tiket");
        System.out.println("6. Keluar");
        System.out.println("=====================================================");
    }

    public static void lihatTiket() {
        System.out.println("\n=== DAFTAR TIKET ===");
        if (daftarTiket.isEmpty()) {
            System.out.println("Belum ada tiket.");
        } else {
            for (int i = 0; i < daftarTiket.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTiket.get(i));
            }
        }
        System.out.println("\nTekan Enter untuk kembali...");
        Scanner.nextLine();
    }

    public static void tambahTiket() {
        System.out.println("\n=== TAMBAH TIKET ===");

        System.out.print("Kode Penerbangan: ");
        String kodePenerbangan = Scanner.nextLine();

        System.out.print("Maskapai: ");
        String Maskapai = Scanner.nextLine();

        System.out.print("Tujuan: ");
        String asal = Scanner.nextLine();
        
        System.out.print("Tujuan: ");
        String tujuan = Scanner.nextLine();

        System.out.print("Armada Pesawat: ");
        String Armada = Scanner.nextLine();

        Model tiketBaru = new Model(kodePenerbangan, Maskapai, asal, tujuan, Armada);

        daftarTiket.add(tiketBaru);

        System.out.println("Tiket berhasil ditambahkan!");
        System.out.println("Tekan Enter untuk kembali...");
       Scanner.nextLine();
    }
    
    public static void editTiket() {
        System.out.println("========= EDIT TIKET ==========");
        
        if (daftarTiket.isEmpty()) {
            System.out.println("Tiket Tidak Tersedia!");
            System.out.println("Tekan Enter untuk kembali...");
            Scanner.nextLine();
            return;
        }
        
        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i));
        }
        
        System.out.println("Pilih tiket yang ingin diedit: ");
        int nomor = Scanner.nextInt();
        Scanner.nextLine();
        
        if (nomor < 1 || nomor > daftarTiket.size()) {
            System.out.println("Nomor tiket tidak valid");
            System.out.println("Tekan Enter untuk kembali...");
            Scanner.nextLine();
            return;
        }       
        
        System.out.println("========= Edit Data Tiket ============");
        
        System.out.print("Kode Penerbangan Baru: ");
        String kodeBaru = Scanner.nextLine();
        
        System.out.print("Maskapai Baru: ");
        String maskapaiBaru = Scanner.nextLine();
        
        System.out.print("Tujuan Baru: ");
        String asalBaru =Scanner.nextLine();
        
        System.out.print("Tujuan Baru: ");
        String tujuanBaru =Scanner.nextLine();
        
        System.out.print("Armada Baru: ");
        String armadaBaru = Scanner.nextLine();

        
        Model tiketBaru = new Model(kodeBaru, maskapaiBaru, tujuanBaru, asalBaru, armadaBaru);

        daftarTiket.set(nomor - 1, tiketBaru);

        System.out.println("Tiket berhasil diupdate.");
        System.out.println("Tekan Enter untuk kembali...");
        Scanner.nextLine();
        menuUtama();
    }
    
    public static void hapusTiket() {
            System.out.println("\n========= HAPUS TIKET ==========");

        if (daftarTiket.isEmpty()) {
            System.out.println("Tiket Tidak Tersedia!");
            System.out.println("Tekan Enter untuk kembali...");
            Scanner.nextLine();
            return;
        }

        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i));
        }

        System.out.print("Pilih nomor tiket yang ingin dihapus: ");
        int nomor = Scanner.nextInt();
        Scanner.nextLine();

        if (nomor < 1 || nomor > daftarTiket.size()) {
            System.out.println("Nomor tiket tidak valid");
            System.out.println("Tekan Enter untuk kembali...");
            Scanner.nextLine();
            return;
        }

        Model tiketDihapus = daftarTiket.remove(nomor - 1);
        System.out.println("Tiket \"" + tiketDihapus + "\" berhasil dihapus.");
        System.out.println("Tekan Enter untuk kembali...");
        Scanner.nextLine();

    }
    
    public static void cariTiket() {
        System.out.println("============ CARI TIKET =============");
        System.out.print("Masukkan kata kunci (kode atau maskapai): ");
        String cari = Scanner.nextLine().trim().toLowerCase();

        boolean ditemukan = false;
        for (Model tiket : daftarTiket) {
            if (tiket.getkodePenerbangan().toLowerCase().contains(cari) ||
            tiket.getMaskapai().toLowerCase().contains(cari)) {
            System.out.println(tiket);
            ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tiket tidak ditemukan.");
        }
        
        System.out.println("Tekan Enter Untuk Kembali....");
        Scanner.nextLine();
    }
        
    public static void initDaftarTiket() {
        daftarTiket.add(new Model("JT123", "Garuda Indonesia", "Balikpapan", "Jakarta", "Boeing 737"));
        daftarTiket.add(new Model("JT456", "Lion Air", "Balikpapan", "Surabaya", "Airbus A320"));
        daftarTiket.add(new Model("JT789", "Citilink", "Balikpapan", "Bali", "ATR 72"));
        daftarTiket.add(new Model("JT012", "AirAsia", "Balikpapan", "Yogyakarta", "Airbus A320neo"));
        daftarTiket.add(new Model("JT345", "Super Air Jet", "Balikpapan", "Medan", "Boeing 737-800"));
    }
}
