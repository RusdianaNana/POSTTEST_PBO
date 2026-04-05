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
                case 1 -> tambahData();
                case 2 -> lihatData();
                case 3 -> updateData();
                case 4 -> hapusData();
                case 5 -> System.out.println("Program selesai.");
                default -> System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Judul Film : ");
        String judul = input.nextLine();

        System.out.print("Genre : ");
        String genre = input.nextLine();

        System.out.print("Durasi : ");
        int durasi = input.nextInt();
        input.nextLine();

        System.out.print("Studio : ");
        String studio = input.nextLine();

        System.out.print("Harga : ");
        int harga = input.nextInt();
        input.nextLine();

        Film film = new Film(judul, genre, durasi);

        System.out.println("Jenis Tiket:");
        System.out.println("1. Reguler");
        System.out.println("2. VIP");
        System.out.println("3. VVIP");
        System.out.print("Pilih : ");
        int jenis = input.nextInt();
        input.nextLine();

        TiketBioskop tiket;

        if (jenis == 1) {
            tiket = new TiketReguler(film, studio, harga);
        } else if (jenis == 2) {
            System.out.print("Fasilitas VIP : ");
            String fasilitas = input.nextLine();
            tiket = new TiketVIP(film, studio, harga, fasilitas);
        } else {
            System.out.print("Bonus VVIP : ");
            String bonus = input.nextLine();
            tiket = new TiketVVIP(film, studio, harga, bonus);
        }

        daftarTiket.add(tiket);
        System.out.println("Data berhasil ditambahkan.");
    }

    static void lihatData() {
        if (daftarTiket.isEmpty()) {
            System.out.println("Data kosong.");
            return;
        }

        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println("\nData ke-" + (i + 1));
            daftarTiket.get(i).tampilkanTiket();
        }
    }

    static void updateData() {
        lihatData();
        System.out.print("Pilih nomor data : ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < daftarTiket.size()) {
            System.out.print("Judul Baru : ");
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

            daftarTiket.get(index).setFilm(filmBaru);
            daftarTiket.get(index).setStudio(studio);
            daftarTiket.get(index).setHarga(harga);

            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void hapusData() {
        lihatData();
        System.out.print("Pilih nomor data : ");
        int index = input.nextInt() - 1;

        if (index >= 0 && index < daftarTiket.size()) {
            daftarTiket.remove(index);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}