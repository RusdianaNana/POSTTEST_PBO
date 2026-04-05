package Bioskop;

public class TiketVIP extends TiketBioskop {

    private String fasilitas;

    public TiketVIP(Film film, String studio, int harga, String fasilitas) {
        super(film, studio, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public void tampilkanTiket() {
        System.out.println("=== Tiket VIP ===");
        super.tampilkanTiket();
        System.out.println("Fasilitas  : " + fasilitas);
        System.out.println("----------------------------");
    }
}