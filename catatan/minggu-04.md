# Catatan Minggu 4: Polymorphism

## Yang saya kerjakan
Saya mengimplementasikan override `hitungDenda()` pada `Aset` serta ketiga subclass, dan menambahkan dua overload `cari()` pada `KatalogAset`.

## Keputusan desain
Ruang memakai multiplier 1, Laptop 2, dan AlatLab 4 terhadap tarif dasar dari `Varian.aktif().dendaPerHari`. Pencarian nama tidak membedakan huruf besar/kecil.

## Keterbatasan inheritance
Inheritance kurang tepat bila mekanisme peminjaman atau fasilitas aset berubah secara independen, karena perubahan aturan pada induk dapat memengaruhi semua subclass. Komposisi lebih fleksibel untuk kebijakan/strategi yang berbeda.

## Kendala
Tidak ada kendala implementasi utama pada Minggu 4. Maven awalnya tidak tersedia di `PATH`, lalu pengujian dijalankan menggunakan Maven lokal dengan JDK 27 sebagai runtime tanpa mengubah versi Java di konfigurasi proyek.

## Hasil pengujian
- Tes Minggu 4: 8 lulus, 0 gagal, 0 error.
- Regresi Minggu 1–3: 19 lulus, 0 gagal, 0 error.

## Penggunaan AI
- Alat yang dipakai: GitHub Copilot.
- Bagian yang dibantu AI: merapikan `hitungDenda()` agar validasi dan tarif dasar diwariskan, menerapkan multiplier setiap subclass, serta memperjelas pencarian katalog dengan `Locale.ROOT`.
- Prompt utama: kerjakan Minggu 4 sesuai docs/minggu-04.md dan kebijakan AI.
- Yang saya ubah atau tolak dari saran AI: saya mengikuti multiplier dan tarif varian secara langsung tanpa mengubah POM atau tes.
- Satu hal yang saya pahami lebih baik sekarang: overriding memungkinkan pemanggilan metode dasar menjalankan implementasi khusus berdasarkan tipe objek runtime.
