package Bioskop;
public class TiketBioskop {

    Film film;
    String studio;
    int harga;

    TiketBioskop(Film film, String studio, int harga) {
        this.film = film;
        this.studio = studio;
        this.harga = harga;
    }
    void tampilkanTiket() {
        film.tampilkanFilm();
        System.out.println("Studio     : " + studio);
        System.out.println("Harga      : " + harga);
        System.out.println("----------------------------");
    }
}