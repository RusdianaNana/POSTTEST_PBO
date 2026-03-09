# 🎬 Sistem Penjualan Tiket Bioskop
  Program **Sistem Penjualan Tiket Bioskop** merupakan implementasi konsep **Class dalam Java**.
Program ini digunakan untuk mengelola data tiket bioskop dengan fitur **CRUD (Create, Read, Update, Delete)** menggunakan **ArrayList**.
Program berjalan dengan **menu interaktif** yang akan terus berjalan sampai pengguna memilih menu **Exit**.

# ⚙️ Konsep yang Digunakan
Program ini mengimplementasikan konsep-konsep dasar **Pemrograman Berorientasi Objek**, yaitu:
* Class
* Object
* Property (Atribut)
* Method
* Constructor
* Keyword `this`
* ArrayList
* CRUD (Create, Read, Update, Delete)
# 🧩 Struktur Class
Program terdiri dari **3 class**, yaitu:
## 1️⃣ Class Film
Class ini digunakan untuk menyimpan informasi mengenai film yang ditayangkan di bioskop.
**Property**
* `judul`
* `genre`
* `durasi`
**Method**
* `tampilkanFilm()` → menampilkan informasi film
**Constructor**
* Constructor tanpa parameter
* Constructor dengan parameter
## 2️⃣ Class TiketBioskop
Class ini digunakan untuk menyimpan informasi tiket bioskop.
**Property**
* `Film film`
* `studio`
* `harga`
**Method**
* `tampilkanTiket()` → menampilkan informasi tiket bioskop
**Constructor**
* `TiketBioskop(Film film, String studio, int harga)`
---

## 3️⃣ Class Main
Class ini merupakan class utama yang menjalankan program.
Class ini berfungsi untuk:
* Menyimpan data tiket menggunakan **ArrayList**
* Menampilkan menu program
* Mengelola operasi **CRUD**
  
**Method yang digunakan**
* `tambahData()` → menambahkan data tiket
* `lihatData()` → menampilkan data tiket
* `updateData()` → memperbarui data tiket
* `hapusData()` → menghapus data tiket
  
# 🧪 Fitur Program
Program memiliki beberapa fitur utama:
### 1. Tambah Tiket
Menambahkan data film, studio, dan harga tiket.

### 2. Lihat Data Tiket
Menampilkan semua data tiket yang telah disimpan.

### 3. Update Tiket

Memperbarui data tiket berdasarkan nomor data.

### 4. Hapus Tiket
Menghapus data tiket dari daftar.

### 5. Exit
Menghentikan program.
---
# 💻 Contoh Tampilan Program
```
===== SISTEM PENJUALAN TIKET BIOSKOP =====
1. Tambah Tiket
2. Lihat Data Tiket
3. Update Tiket
4. Hapus Tiket
5. Exit
Pilih Menu :
```
---
Program ini berhasil mengimplementasikan konsep dasar **Class dalam Java** dengan membuat beberapa class yang saling berhubungan.
Selain itu, program juga dapat melakukan operasi **CRUD menggunakan ArrayList** dan berjalan menggunakan **menu interaktif** sampai pengguna memilih keluar dari program.
