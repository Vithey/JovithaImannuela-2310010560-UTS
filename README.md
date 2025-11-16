# JovithaImannuela-2310010560-UTS
Aplikasi Buku Alamat - UTS
# Aplikasi Buku Alamat Sederhana

Aplikasi Buku Alamat berbasis Java Swing ini memungkinkan pengguna untuk menyimpan, mengelola, serta mengimpor dan mengekspor data kontak (buku alamat) ke berbagai format file seperti TXT dan PDF. Data tersimpan di database melalui koneksi JDBC. Aplikasi ini juga mendukung validasi dan penanganan perubahan data yang belum disimpan.

## Fitur Utama

- **CRUD (Create, Read, Update, Delete):**
  - Tambah, ubah, dan hapus data kontak (nama, telepon, email, alamat, properti, keterangan)
- **Impor Data:**
  - Mendukung impor dari file TXT dan PDF ke database
- **Ekspor Data:**
  - Mendukung ekspor data kontak ke file TXT dan PDF
- **Validasi Form:**
  - Field telepon wajib angka
  - Field email wajib mengandung `@`
  - Field nama wajib diisi
- **Notifikasi & Konfirmasi Keluar:**
  - Peringatan jika ada data yang belum disimpan saat aplikasi ditutup
- **UI Interaktif:**
  - Menggunakan Java Swing JTable dan form input interaktif
- **Dukungan Format Properti:**
  - Dropdown pilihan properti: Rumah, Kantor, Sekolah, Apartemen, dll

## Struktur Data Kontak

| Kolom       | Tipe Data | Keterangan    |
|-------------|-----------|---------------|
| id          | Integer   | Auto Increment, Primary Key |
| nama        | String    | Nama Kontak   |
| telepon     | String    | No. Telepon   |
| email       | String    | Email         |
| alamat      | String    | Alamat Lengkap|
| properti    | String    | Jenis Properti|
| keterangan  | String    | Keterangan/Notes|

## Cara Menjalankan

1. **Koneksi Database:**
   - Pastikan terdapat class `Database.Koneksi` yang menginisialisasi koneksi JDBC ke database.
   - Tabel utama bernama `kontak` (lihat struktur di atas).
2. **Library yang Dibutuhkan:**
   - [iText](https://itextpdf.com/) & [Apache PDFBox](https://pdfbox.apache.org/) untuk fitur ekspor/impor PDF
   - JDBC driver sesuai database (MySQL/SQLite/dsb)
3. **Kompilasi & Jalankan:**
   - Pastikan semua dependensi sudah masuk ke classpath.
   - Jalankan file ini sebagai aplikasi Java GUI.
   - Gunakan menu untuk tambah, edit, hapus, impor, dan ekspor data.

## Fitur Impor/Ekspor

- **Ekspor**
  - TXT: Data kontak diekspor dengan pemisah TAB
  - PDF: Data kontak diekspor dalam bentuk tabel landscape A4
- **Impor**
  - TXT: Baca file berformat tab, satu baris satu kontak (header akan di-skip)
  - PDF: Mendukung parsing sederhana berdasarkan pemisah koma pada setiap baris (format sangat tergantung tampilan PDF sumber)

## Catatan Penggunaan

- Pastikan format file saat impor mengikuti struktur header/data yang tepat agar parsing sukses.
- Fitur ekpor CSV/JSON dapat ditambahkan sesuai kebutuhan.
- Data field properti sudah disediakan dari combo box.

## Struktur UI

- **Form Input:** Nama, Telepon, Email, Alamat, Properti, Keterangan
- **Tabel:** Menampilkan semua data kontak dari database
- **Tombol Utama:** Save, Update, Delete, Ekspor, Impor, Keluar

---

**Penulis:**  
- Adaptasi kode oleh [Vithey](https://github.com/Vithey)  
- Untuk keperluan pembelajaran dan UTS Pemrograman Java GUI
