# 🎬 SISTEM PENJUALAN TIKET BIOSKOP

## 📌 Deskripsi Program

Program ini merupakan aplikasi berbasis Java yang digunakan untuk mengelola data tiket bioskop. Sistem ini memungkinkan pengguna untuk menambahkan, melihat, mengubah, dan menghapus data tiket.

Program ini merupakan lanjutan dari posttest sebelumnya dengan penambahan konsep **Polymorphism** sebagai bagian dari materi Pemrograman Berorientasi Objek (OOP).

---

## 🎯 Tujuan

Tujuan dari pembuatan program ini adalah:

* Melanjutkan implementasi program dari posttest sebelumnya
* Menerapkan konsep **Inheritance** dan **Polymorphism**
* Memahami penggunaan method **Overloading** dan **Overriding**
* Mengelola data menggunakan struktur ArrayList

---

## ⚙️ Fitur Program

Program ini memiliki beberapa fitur utama:

* Menambahkan data tiket bioskop
* Menampilkan data tiket
* Mengupdate data tiket
* Menghapus data tiket
* Menyimpan waktu input secara otomatis

---

## 🧠 Konsep OOP yang Digunakan

### 1. Inheritance

Program ini menggunakan konsep inheritance dengan struktur:

* **Superclass:**
  `TiketBioskop`

* **Subclass:**
  `TiketReguler`
  `TiketVIP`
  `TiketVVIP`

Relasi yang digunakan adalah **is-a**, dimana setiap jenis tiket merupakan turunan dari `TiketBioskop`.

---

### 2. Polymorphism (Posttest 5)

Pada posttest ini, konsep polymorphism diterapkan dalam dua bentuk:

---

### 🔹 A. Method Overriding (Polymorphism Dinamis)

Overriding digunakan pada subclass untuk mengubah isi method dari superclass.

#### 📍 Lokasi:

* `TiketReguler.java`
* `TiketVIP.java`
* `TiketVVIP.java`

#### 📌 Contoh:

```java
@Override
public void tampilkanTiket() {
    System.out.println("=== Tiket VIP ===");
    super.tampilkanTiket();
    System.out.println("Fasilitas  : " + fasilitas);
}
```

#### 📖 Penjelasan:

Method `tampilkanTiket()` diwarisi dari `TiketBioskop`, namun diubah pada masing-masing subclass agar memiliki output yang berbeda sesuai jenis tiket.

---

### 🔹 B. Method Overloading (Polymorphism Statis)

Overloading digunakan dengan membuat method dengan nama yang sama tetapi parameter berbeda.

#### 📍 Lokasi:

* `TiketBioskop.java`

#### 📌 Contoh:

```java
public void tampilkanTiket() { ... }

public void tampilkanTiket(String keterangan) { ... }

public void tampilkanTiket(boolean simple) { ... }
```

#### 📖 Penjelasan:

Method `tampilkanTiket()` memiliki beberapa versi dengan parameter berbeda, sehingga dapat digunakan untuk menampilkan data dengan cara yang berbeda.

---

### 🔹 C. Pemanggilan Polymorphism di Main

Polymorphism digunakan saat pemanggilan method:

```java
daftarTiket.get(i).tampilkanTiket("Data Tiket");
```

#### 📖 Penjelasan:

* Method yang dipanggil akan menyesuaikan dengan tipe objek (Reguler, VIP, atau VVIP)
* Ini merupakan contoh **dynamic polymorphism (overriding)**

---

## 🏗️ Struktur Program

```id="l3v9wd"
Bioskop/
├── Film.java
├── TiketBioskop.java
├── TiketReguler.java
├── TiketVIP.java
├── TiketVVIP.java
└── Main.java
```

---

## 🚀 Cara Menjalankan Program

1. Buka project di IntelliJ IDEA
2. Pastikan semua file berada dalam package `Bioskop`
3. Jalankan file `Main.java`
4. Pilih menu sesuai kebutuhan

---

## 📋 Contoh Menu

```id="n3f7t0"
===== SISTEM PENJUALAN TIKET BIOSKOP =====
1. Tambah Tiket
2. Lihat Data Tiket
3. Update Tiket
4. Hapus Tiket
5. Exit
```

---

## 📝 Kelebihan Program

* Menggunakan konsep OOP secara terstruktur
* Tidak terjadi duplikasi kode karena inheritance
* Fleksibel karena menggunakan polymorphism
* Mudah dikembangkan untuk fitur tambahan

---

## 📌 Kesimpulan

Program ini berhasil mengimplementasikan konsep **Inheritance** dan **Polymorphism** sesuai dengan materi yang diberikan. Pada posttest 5, fokus utama adalah penerapan polymorphism melalui method overloading dan overriding yang telah diterapkan secara logis pada sistem tiket bioskop.

Dengan adanya konsep ini, program menjadi lebih fleksibel, terstruktur, dan mudah dikembangkan.

