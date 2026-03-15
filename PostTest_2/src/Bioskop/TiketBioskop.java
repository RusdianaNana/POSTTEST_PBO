package Bioskop;
import java.time.LocalDateTime;
public class TiketBioskop {

    private Film film;        // private
    protected String studio;  // protected
    int harga;                // default
    public LocalDateTime waktuInput; // public
    public TiketBioskop(Film film, String studio, int harga) {
        this.film = film;
        this.studio = studio;
        this.harga = harga;
        this.waktuInput = LocalDateTime.now();
    }
    public Film getFilm() {
        return film;
    }
    public void setFilm(Film film) {
        this.film = film;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        }
    }
    public void tampilkanTiket() {
        film.tampilkanFilm();
        System.out.println("Studio     : " + studio);
        System.out.println("Harga      : " + harga);
        System.out.println("Waktu Input: " + waktuInput);
        System.out.println("----------------------------");
    }
}