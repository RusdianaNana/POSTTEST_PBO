package Bioskop;

public class TiketReguler extends TiketBioskop {

    public TiketReguler(Film film, String studio, int harga) {
        super(film, studio, harga);
    }

    @Override
    public void tampilkanTiket() {
        System.out.println("=== Tiket Reguler ===");
        super.tampilkanTiket();
        System.out.println("----------------------------");
    }
}