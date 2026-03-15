# Posttest 2 – Sistem Penjualan Tiket Bioskop (Encapsulation)
Program ini merupakan pengembangan dari **Posttest 1** yang berisi sistem sederhana untuk mengelola data tiket bioskop menggunakan bahasa pemrograman Java. Pada Posttest 2, program dikembangkan dengan menerapkan konsep **Encapsulation** dalam pemrograman berorientasi objek.
Program ini memungkinkan pengguna untuk melakukan beberapa operasi terhadap data tiket bioskop, yaitu:
* Menambahkan data tiket
* Melihat data tiket
* Mengupdate data tiket
* Menghapus data tiket
Semua data tiket disimpan sementara menggunakan **ArrayList** selama program berjalan.

---

## Konsep yang Digunakan

### 1. Encapsulation
Encapsulation merupakan konsep dalam pemrograman berorientasi objek yang digunakan untuk menyembunyikan data di dalam sebuah class sehingga tidak dapat diakses secara langsung dari luar class tersebut.
Pada program ini, beberapa atribut pada class dibuat menggunakan access modifier **private**, sehingga akses terhadap atribut tersebut hanya dapat dilakukan melalui method **getter** dan **setter**.
Contoh penerapan encapsulation terdapat pada class `Film`:
```java
private String judul;
private String genre;
private int durasi;
```
Atribut tersebut hanya dapat diakses menggunakan method getter dan setter.
---

### 2. Getter dan Setter
Getter dan Setter digunakan untuk mengambil serta mengubah nilai atribut yang bersifat private.
Contoh getter dan setter pada class `Film`:
```java
public String getJudul() {
    return judul;
}
public void setJudul(String judul) {
    this.judul = judul;
}
```
Dengan cara ini, data dalam class tetap terjaga dan tidak dapat diubah secara langsung dari luar class.
---

### 3. Access Modifier
Program ini menggunakan beberapa jenis **access modifier**, yaitu:
* **private**
  Digunakan untuk menyembunyikan atribut agar hanya dapat diakses di dalam class yang sama.
* **protected**
  Digunakan agar atribut dapat diakses oleh class dalam package yang sama atau subclass.
* **default (package-private)**
  Digunakan ketika tidak mencantumkan access modifier sehingga hanya dapat diakses dalam package yang sama.
* **public**
  Digunakan agar atribut atau method dapat diakses dari class lain.
Contoh penggunaan access modifier pada class `TiketBioskop`:
```java
private Film film;
protected String studio;
int harga;
public LocalDateTime waktuInput;
```

---

## Struktur Program
Struktur folder pada program ini adalah sebagai berikut:
```
PostTest_1
 └── src
      └── Bioskop
           ├── Film.java
           ├── TiketBioskop.java
           └── Main.java
PostTest_2
 └── src
      └── Bioskop
           ├── Film.java
           ├── TiketBioskop.java
           └── Main.java
```

Penjelasan masing-masing class:
**Film.java**
Berisi atribut yang menyimpan informasi film seperti judul, genre, dan durasi.
**TiketBioskop.java**
Berisi data tiket yang terdiri dari objek film, studio, harga tiket, serta waktu input data.
**Main.java**
Merupakan class utama yang menjalankan program serta menyediakan menu untuk mengelola data tiket bioskop.

---
## Library yang Digunakan
Program ini menggunakan beberapa library bawaan dari Java, yaitu:
* `java.util.ArrayList`
  Digunakan untuk menyimpan daftar tiket bioskop.
* `java.util.Scanner`
  Digunakan untuk menerima input dari pengguna melalui keyboard.
* `java.time.LocalDateTime`
  Digunakan untuk mencatat waktu ketika data tiket dimasukkan ke dalam sistem.

---

## Cara Menjalankan Program
1. Jalankan file `Main.java`.
2. Program akan menampilkan menu sistem penjualan tiket bioskop.
3. Pilih menu yang tersedia dengan memasukkan angka sesuai pilihan.
Menu yang tersedia pada program:

```
1. Tambah Tiket
2. Lihat Data Tiket
3. Update Tiket
4. Hapus Tiket
5. Exit
```

Program akan berjalan terus hingga pengguna memilih menu **Exit**.

---

## Kesimpulan
Program ini merupakan implementasi sederhana dari konsep **Encapsulation** dalam pemrograman berorientasi objek menggunakan Java. Dengan menggunakan encapsulation, data dalam class dapat lebih terjaga karena tidak dapat diakses secara langsung dari luar class. Selain itu, penggunaan getter dan setter memungkinkan pengaturan akses terhadap atribut sehingga program menjadi lebih terstruktur dan aman.
