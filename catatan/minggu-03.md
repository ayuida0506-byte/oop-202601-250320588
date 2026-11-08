# Catatan Minggu 3: Inheritance

## Yang saya kerjakan
Saya melengkapi class `Ruang`, `Laptop`, dan `AlatLab` dengan field khusus, konstruktor yang memanggil `super`, getter, validasi, dan implementasi `getJenis()`.

## Keputusan desain
Data umum tetap berada di `Aset`; kapasitas ditempatkan di `Ruang`, spesifikasi dan nomor inventaris di `Laptop`, serta laboratorium dan tingkat risiko di `AlatLab`.

## Keterbatasan inheritance
Inheritance kurang tepat untuk perilaku yang bisa berubah antar aset atau ketika satu aset mempunyai banyak role yang berbeda. Dalam sistem ini, riwayat peminjaman lebih tepat disimpan melalui komposisi objek `Peminjaman`, karena satu aset dapat memiliki banyak transaksi dan transaksi tidak menjadi bagian permanen dari jenis aset.

## Kendala
Tidak ada kendala implementasi utama pada Minggu 3. Awalnya Maven belum tersedia di `PATH`, sehingga pengujian dijalankan dengan Maven lokal dan JDK 27 untuk memenuhi konfigurasi Java 21 proyek.

## Hasil pengujian
- Tes Minggu 3: 8 lulus, 0 gagal, 0 error.
- Regresi Minggu 1–3: 19 lulus, 0 gagal, 0 error.

## Penggunaan AI
- Alat yang dipakai: GitHub Copilot.
- Bagian yang dibantu AI: memeriksa dokumen dan tes Minggu 3, memastikan implementasi hierarki serta validasi subclass, serta menambahkan komentar singkat pada bagian penting.
- Prompt utama: "Kerjakan Minggu 3 sesuai docs/minggu-03.md, patuhi kebijakan AI, jangan ubah pom.xml/dependency/tes, dan isi catatan dengan jujur."
- Yang saya ubah atau tolak dari saran AI: saya mempertahankan data khusus pada subclass, tidak mengubah pom.xml, dependency, file tes, maupun file `aset pinjam`; catatan yang sudah ada juga saya cek agar sesuai hasil kerja.
- Satu hal yang saya pahami lebih baik sekarang: subclass dapat memakai validasi induk melalui `super` sekaligus menambahkan aturan khusus, sementara inheritance tidak selalu tepat untuk data yang memiliki banyak hubungan atau riwayat.
