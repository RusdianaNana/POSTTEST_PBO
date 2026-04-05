package Bioskop;

public class TiketVVIP extends TiketBioskop {

    private String bonus;

    public TiketVVIP(Film film, String studio, int harga, String bonus) {
        super(film, studio, harga);
        this.bonus = bonus;
    }

    @Override
    public void tampilkanTiket() {
        System.out.println("=== Tiket VVIP ===");
        super.tampilkanTiket();
        System.out.println("Bonus      : " + bonus);
        System.out.println("----------------------------");
    }
}