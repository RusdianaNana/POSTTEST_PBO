package Bioskop;
public class Film {

    private String judul;
    private String genre;
    private int durasi;
    public Film() {
        this.judul = "Default";
        this.genre = "Unknown";
        this.durasi = 0;
    }
    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        if (durasi > 0) {
            this.durasi = durasi;
        }
    }
    public void tampilkanFilm() {
        System.out.println("Judul Film : " + judul);
        System.out.println("Genre      : " + genre);
        System.out.println("Durasi     : " + durasi + " menit");
    }
}