package Bioskop;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<TiketBioskop> daftarTiket = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===== SISTEM PENJUALAN TIKET BIOSKOP =====");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Lihat Data Tiket");
            System.out.println("3. Update Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {

                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 5);
    }
    static void tambahData() {
        System.out.print("Judul Film : ");
        String judul = input.nextLine();

        System.out.print("Genre Film : ");
        String genre = input.nextLine();

        System.out.print("Durasi Film (menit) : ");
        int durasi = input.nextInt();
        input.nextLine();

        System.out.print("Studio : ");
        String studio = input.nextLine();

        System.out.print("Harga Tiket : ");
        int harga = input.nextInt();
        input.nextLine();

        Film film = new Film(judul, genre, durasi);
        TiketBioskop tiket = new TiketBioskop(film, studio, harga);
        daftarTiket.add(tiket);
        System.out.println("Data tiket berhasil ditambahkan.");
    }
    static void lihatData() {
        if (daftarTiket.isEmpty()) {
            System.out.println("Data tiket masih kosong.");
            return;
        }
        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println("\nData ke-" + (i + 1));
            daftarTiket.get(i).tampilkanTiket();
        }
    }
    static void updateData() {
        lihatData();
        System.out.print("Pilih nomor data yang ingin diupdate : ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < daftarTiket.size()) {
            System.out.print("Judul Film Baru : ");
            String judul = input.nextLine();
            System.out.print("Genre Baru : ");
            String genre = input.nextLine();
            System.out.print("Durasi Baru : ");
            int durasi = input.nextInt();
            input.nextLine();
            System.out.print("Studio Baru : ");
            String studio = input.nextLine();
            System.out.print("Harga Baru : ");
            int harga = input.nextInt();
            input.nextLine();

            Film filmBaru = new Film(judul, genre, durasi);
            daftarTiket.set(index, new TiketBioskop(filmBaru, studio, harga));
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    static void hapusData() {
        lihatData();
        System.out.print("Pilih nomor data yang ingin dihapus : ");
        int index = input.nextInt() - 1;
        if (index >= 0 && index < daftarTiket.size()) {
            daftarTiket.remove(index);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");

        }
    }
}