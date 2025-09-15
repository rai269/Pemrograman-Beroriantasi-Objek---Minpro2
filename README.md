# Pemrograman-Beroriantasi-Objek

Nama: Raihan Fariz N


NIM: 2409116083

## Deskripsi Program
Program Sistem TiketPlane adalah program untuk mengelola data tiket penerbangan. Program ini dibuat

dengan bahasa pemrograman Java menggunakan konsep Pemrograman Berorientasi Objek (PBO) dan

memanfaatkan ArrayList sebagai tempat penyimpanan data tiket secara dinamis.

Fitur utama program ini adalah:


- Menampilkan daftar tiket

- Menambahkan tiket baru

- Mengedit tiket yang sudah ada

- Menghapus tiket

- Mencari tiket

- Keluar dari program


Program menggunakan pendekatan berbasis objek dan struktur modular agar mudah dikembangkan dan dipahami.

## Struktur Class dan Fungsinya
Program ini hanya menggunakan satu class utama yaitu , namun di dalamnya terdapat beberapa method modular yang berfungsi sebagai controller dan UI interaktif.

### 1. Main.java
Class utama yang berisi method  dan seluruh logika program.


#### A. Import Package

    import java.util.Scanner;
    import java.util.ArrayList;


Scanner digunakan untuk mengambil input dari user.

ArrayList digunakan untuk menyimpan daftar tiket secara dinamis.




#### B. Inisialisasi Data

    static Scanner objekScanner = new Scanner(System.in); 
    static ArrayList<String> daftarTiket = new ArrayList<>();
    

objekScanner: objek untuk membaca input user.

daftarTiket: menampung semua data tiket yang tersedia.




#### C. menuUtama()

    public static void menuUtama() {
    System.out.println("\n======= SELAMAT DATANG DI SISTEM TIKETPLANE ========");
    System.out.println("1. Lihat Daftar Tiket");
    System.out.println("2. Tambah Tiket Baru");
    System.out.println("3. Edit Tiket");
    System.out.println("4. Hapus Tiket");
    System.out.println("5. Keluar");
    System.out.println("=====================================================");
    }

Method ini menampilkan menu pilihan untuk user dan melakukan input agar user, di antaranya adalah:

1. Lihat Daftar Tiket

2. Tambah Tiket Baru

3. Edit Tiket

4. Hapus Tiket

5. Keluar

Jika User memilih 1, maka user dapat melihat daftar tiket yang ada.

Jika User memilih 2, maka user dapat menambah tiket sesuai dengan variable input.

Jika user memilih 3, maka user dapat mengupdate (Edit) tiket yang sudah tersedia.

Jika user memilih 4, maka user dapat menghapus tiket yang sudah tersedia.

Jika user memilih 5, maka user dapat keluar dari program (menghentikan program)




#### D. lihatTiket()

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
    objekScanner.nextLine();
    }

Fungsi dari method lihatTiket() adalah untuk menampilkan semua tiket yang sudah ada di dalam sistem.

Jika kosong sistem akan memberi tahu bahwa tiket belum tersedia.




#### E. tambahTiket()

    public static void tambahTiket() {
    System.out.println("\n=== TAMBAH TIKET ===");

    System.out.print("Kode Penerbangan: ");
    String namaPenerbangan = objekScanner.nextLine();

    System.out.print("Maskapai: ");
    String maskapai = objekScanner.nextLine();

    System.out.print("Tujuan: ");
    String tujuan = objekScanner.nextLine();

    System.out.print("Terminal: ");
    String terminal = objekScanner.nextLine();

    System.out.print("Armada Pesawat: ");
    String armada = objekScanner.nextLine();

    String tiketBaru = namaPenerbangan + " | " + maskapai + " | " + tujuan +
                       " | Terminal: " + terminal + " | Armada: " + armada;

    daftarTiket.add(tiketBaru);

    System.out.println("Tiket berhasil ditambahkan!");
    System.out.println("Tekan Enter untuk kembali...");
    objekScanner.nextLine();
    } 


Method ini memungkinkan user menambahkan tiket baru dengan memasukkan kode penerbangan, maskapai, tujuan, terminal, dan armada.




#### F. editTiket()
    public static void editTiket() {
    System.out.println("========= EDIT TIKET ==========");

    if (daftarTiket.isEmpty()) {
        System.out.println("Tiket Tidak Tersedia!");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();
        return;
    }

    for (int i = 0; i < daftarTiket.size(); i++) {
        System.out.println((i + 1) + ". " + daftarTiket.get(i));
    }

    System.out.println("Pilih tiket yang ingin diedit: ");
    int nomor = objekScanner.nextInt();
    objekScanner.nextLine();

    if (nomor < 1 || nomor > daftarTiket.size()) {
        System.out.println("Nomor tiket tidak valid");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();
        return;
    }

    System.out.print("Kode Penerbangan Baru: ");
    String kodeBaru = objekScanner.nextLine();

    System.out.print("Maskapai Baru: ");
    String maskapaiBaru = objekScanner.nextLine();

    System.out.print("Tujuan Baru: ");
    String tujuanBaru = objekScanner.nextLine();

    System.out.print("Terminal Baru: ");
    String terminalBaru = objekScanner.nextLine();

    System.out.print("Armada Baru: ");
    String armadaBaru = objekScanner.nextLine();

    String tiketBaru = kodeBaru + " | " + maskapaiBaru + " | " + tujuanBaru +
                   " | " + terminalBaru + " | " + armadaBaru;

    daftarTiket.set(nomor - 1, tiketBaru);

    System.out.println("Tiket berhasil diupdate.");
    System.out.println("Tekan Enter untuk kembali...");
    objekScanner.nextLine();
    }

Fungsi dari method editTiket() ini adalah user dapat mengedit data tiket yang sudah ada.

User dapat mengganti informasi penerbangan dengan data baru.




#### G. hapusTiket()

    public static void hapusTiket() {
    System.out.println("\n========= HAPUS TIKET ==========");

    if (daftarTiket.isEmpty()) {
        System.out.println("Tiket Tidak Tersedia!");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();
        return;
    }

    for (int i = 0; i < daftarTiket.size(); i++) {
        System.out.println((i + 1) + ". " + daftarTiket.get(i));
    }

    System.out.print("Pilih nomor tiket yang ingin dihapus: ");
    int nomor = objekScanner.nextInt();
    objekScanner.nextLine();

    if (nomor < 1 || nomor > daftarTiket.size()) {
        System.out.println("Nomor tiket tidak valid");
        System.out.println("Tekan Enter untuk kembali...");
        objekScanner.nextLine();
        return;
    }

    String tiketDihapus = daftarTiket.remove(nomor - 1);
    System.out.println("Tiket \"" + tiketDihapus + "\" berhasil dihapus.");
    System.out.println("Tekan Enter untuk kembali...");
    objekScanner.nextLine();
    }

Fungsi dari method hapusTiket() adalah untuk menghapus tiket yang dipilih dari daftar.

User dapat menghapus tiket yang sudah ada di dalam daftar tiket sebelumnya.




#### H. Inisialisasi Daftar Tiket

    public static void initDaftarTiket() {
    daftarTiket.add("JT123 | Garuda Indonesia | Balikpapan - Jakarta | Terminal: T3 | Armada: Boeing 737");
    daftarTiket.add("JT456 | Lion Air | Balikpapan - Surabaya | Terminal: T1 | Armada: Airbus A320");
    daftarTiket.add("JT789 | Citilink | Balikpapan - Bali | Terminal: T2 | Armada: ATR 72");
    daftarTiket.add("JT012 | AirAsia | Balikpapan - Yogyakarta | Terminal: T1 | Armada: Airbus A320neo");
    daftarTiket.add("JT345 | Super Air Jet | Balikpapan - Medan | Terminal: T3 | Armada: Boeing 737-800");
    }

Method ini berfungsi untuk menambahkan beberapa data tiket default ke dalam sistem agar user langsung bisa mencoba fitur-fitur program.

Namun, Inisialisasi Daftar Tiket ini tidak mengubah database ketika user menjalankan program, yang artinya seluruh hal yang dilakukan user,

tidak akan mengubah apapun, walau jika user menambah, mengedit, dan menghapus. Perubahan hanya terjadi jika program tersebut masih berjalan.

Namun, jika program tersebut telah berhenti maka seluruh perubahan akan kembali seperti semula.


## Alur Program Sederhana

#### 1. Inisialisasi Data

Saat program dijalankan, sistem langsung menambahkan beberapa data tiket default ke dalam daftar tiket

hal ini agar user bisa langsung mencoba fitur tanpa harus menambahkan data terlebih dahulu

Jadi singkatnya adalah, ketika program dijalankan, maka user dapat langsung melihat daftar tiket

yang sudah ada di dalam program, user tidak perlu menambah satu per satu.

#### 2. Menu Utama

Saat program berjalan, maka program akan langsung menampilkan menu pilihan:

1. Lihat Daftar Tiket

2. Tambah Tiket Baru

3. Edit Tiket

4. Hapus Tiket

5. Keluar

Alur Interaksi User

Jika memilih 1 (Lihat Tiket) maka program akan menampilkan daftar tiket yang ada. Jika kosong, sistem akan memberi tahu bahwa tiket belum tersedia.

Jika memilih 2 (Tambah Tiket) maka user akan diminta memasukkan detail penerbangan (kode, maskapai, tujuan, terminal, armada). Data tiket baru akan tersimpan ke dalam ArrayList.

Jika memilih 3 (Edit Tiket) maka user akan melihat daftar tiket, memilih nomor tiket yang ingin diubah, lalu memasukkan data baru. Data lama akan diganti dengan data baru.

Jika memilih 4 (Hapus Tiket) maka user akan memilih tiket berdasarkan nomor urut, lalu sistem akan menghapus tiket tersebut dari daftar.

Jika memilih 5 (Keluar) maka program akan berhenti.

#### 3. Validasi Input

Jika user memasukkan pilihan yang tidak valid, sistem akan menampilkan pesan error dan kembali ke menu utama.
