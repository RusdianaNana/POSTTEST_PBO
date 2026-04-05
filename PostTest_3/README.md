# SISTEM PENJUALAN TIKET BIOSKOP 🎬
  Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk mengelola data tiket bioskop.
Fitur yang tersedia meliputi tambah data tiket, melihat data, mengubah data, dan menghapus data.
---
## Fitur Program

* Menambahkan data tiket
* Menampilkan seluruh data tiket
* Mengupdate data tiket
* Menghapus data tiket
* Menyimpan waktu input tiket secara otomatis

---

## Konsep OOP yang Digunakan

### 1. Class & Object

* Class digunakan untuk merepresentasikan entitas seperti `Film` dan `TiketBioskop`
* Object dibuat dari class tersebut untuk menyimpan data

### 2. Encapsulation

* Atribut pada class dibuat private/protected
* Akses menggunakan method getter dan setter

### 3. Inheritance

Program ini menerapkan konsep inheritance dengan struktur:

* **Superclass:**
  `TiketBioskop`

* **Subclass:**
  `TiketReguler`
  `TiketVIP`
  `TiketVVIP`

Relasi yang digunakan adalah **is-a**, dimana:

* TiketVIP adalah TiketBioskop
* TiketReguler adalah TiketBioskop

Tipe inheritance yang digunakan adalah **Hierarchical Inheritance**.

---

## Struktur Program

```
Bioskop/
├── Film.java
├── TiketBioskop.java
├── TiketReguler.java
├── TiketVIP.java
├── TiketVVIP.java
└── Main.java
```

## Contoh Menu Program

```
===== SISTEM PENJUALAN TIKET BIOSKOP =====
1. Tambah Tiket
2. Lihat Data Tiket
3. Update Tiket
4. Hapus Tiket
5. Exit
```

