# 📌 README PROJECT

## Sistem Penjualan Tiket Bioskop (Posttest 6 - Abstraction & Interface)

### 📖 Deskripsi Program

Program ini merupakan sistem sederhana penjualan tiket bioskop berbasis Java yang dibuat menggunakan konsep **Pemrograman Berorientasi Objek (OOP)**.
Program ini memungkinkan pengguna untuk menambahkan dan melihat data tiket bioskop dengan beberapa jenis tiket, yaitu **Reguler, VIP, dan VVIP**.

---

### 🎯 Tujuan

Tujuan dari project ini adalah untuk mengimplementasikan konsep:

* **Abstraction (Abstract Class & Abstract Method)**
* **Interface**
* **Inheritance (Pewarisan)**
* **Polymorphism**

---

### 🧱 Struktur Program

Program terdiri dari beberapa class sebagai berikut:

* `TiketBioskop` → Abstract Class (parent)
* `TiketReguler`, `TiketVIP`, `TiketVVIP` → Child Class
* `Cetak` → Interface
* `Film` → Class untuk data film
* `Main` → Class utama (driver program)

---

### 🔍 Penjelasan Konsep OOP

#### 1. Abstraction

Abstraction digunakan untuk menyembunyikan detail implementasi dan hanya menampilkan fungsi penting.

* Diterapkan pada:

  ```java
  public abstract class TiketBioskop
  ```
* Abstract method:

  ```java
  public abstract void tampilkanTiket();
  ```

Class ini tidak bisa dibuat objek secara langsung, tetapi digunakan sebagai dasar untuk class turunannya.

---

#### 2. Interface

Interface digunakan sebagai kontrak yang harus diimplementasikan oleh class.

* Interface:

  ```java
  public interface Cetak
  ```
* Method:

  ```java
  void cetakStruk();
  void cetakSimple();
  ```

Semua class turunan wajib mengimplementasikan method tersebut.

---

#### 3. Inheritance (Pewarisan)

Inheritance digunakan agar class turunan dapat mewarisi atribut dan method dari parent.

Contoh:

```java
public class TiketVIP extends TiketBioskop
```

Class `TiketVIP`, `TiketReguler`, dan `TiketVVIP` mewarisi dari `TiketBioskop`.

---

#### 4. Polymorphism

Polymorphism memungkinkan satu variabel memiliki banyak bentuk.

Contoh:

```java
ArrayList<TiketBioskop> daftarTiket = new ArrayList<>();
```

List ini dapat menyimpan berbagai jenis objek:

* TiketReguler
* TiketVIP
* TiketVVIP

---

### ⚙️ Fitur Program

* Menambahkan data tiket
* Menampilkan data tiket
* Menampilkan jenis tiket yang berbeda
* Menampilkan data secara polymorphism
* Menggunakan interface untuk cetak data

---

### ▶️ Cara Menjalankan Program

1. Jalankan class `Main`
2. Pilih menu:

   * 1 → Tambah Tiket
   * 2 → Lihat Data
   * 3 → Keluar
3. Masukkan data sesuai input

---

