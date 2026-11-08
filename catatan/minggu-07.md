# Catatan Minggu 7: Koleksi

## Yang saya kerjakan
Saya mengimplementasikan `bentrok`, `semuaUrutMulai`, `perAset`, dan `hapus` pada `JadwalPeminjaman`.

## Keputusan desain
Saya memakai `List` sebagai struktur penyimpanan utama dan `LinkedHashMap` pada `perAset` agar hasil dikelompokkan menurut kode aset sambil mempertahankan urutan waktu mulai. Bentrok memakai interval setengah terbuka, sehingga selesai pada pukul 11 dan mulai pada pukul 11 tidak dianggap beririsan.

## Kendala
Tes dosen Minggu 7 telah diperiksa dan menguji kasus utama. File `BatasBentrokTest.java` tidak diubah karena instruksi Minggu 7 saat ini melarang perubahan file tes.

## Penggunaan AI
- Alat yang dipakai: GitHub Copilot.
- Bagian yang dibantu AI: menentukan struktur data, implementasi overlap, sorting dengan `Comparator`, grouping, penghapusan, catatan asumsi, dan komentar singkat.
- Prompt utama: "Kerjakan Minggu 7 sesuai docs/minggu-07.md dan kebijakan AI, jangan ubah pom.xml/dependency/tes/aset pinjam."
- Yang saya ubah atau tolak dari saran AI: saya memilih interval setengah terbuka dan tidak mengubah file tes karena larangan eksplisit.
- Satu hal yang saya pahami lebih baik sekarang: `Comparator.comparing()` membantu mengurutkan nilai waktu dengan jelas, sedangkan `Map.computeIfAbsent()` menyederhanakan pengelompokan koleksi.
