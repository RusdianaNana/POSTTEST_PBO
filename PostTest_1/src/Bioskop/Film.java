package Bioskop;
public class Film {

    String judul;
    String genre;
    int durasi;
    Film() {
        this.judul = "Default";
        this.genre = "Unknown";
        this.durasi = 0;
    }
    Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    void tampilkanFilm() {
        System.out.println("Judul Film : " + judul);
        System.out.println("Genre      : " + genre);
        System.out.println("Durasi     : " + durasi + " menit");
    }
}