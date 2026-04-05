package Bioskop;

import java.time.LocalDateTime;

public class TiketBioskop {
    protected Film film;
    protected String studio;
    protected int harga;
    public LocalDateTime waktuInput;

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

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampilkanTiket() {
        film.tampilkanFilm();
        System.out.println("Studio     : " + studio);
        System.out.println("Harga      : " + harga);
        System.out.println("Waktu Input: " + waktuInput);
    }
}