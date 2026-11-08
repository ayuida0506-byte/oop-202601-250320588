# Catatan Minggu 5: Abstraksi

## Yang saya kerjakan
Saya menjadikan `Aset` sebagai abstract class, mengimplementasikan `bisaDipinjam()`, membuat `hitungDenda()` abstrak, lalu mengimplementasikan `DendaFlat` dan `DendaProgresif`.

## Keputusan desain
`Aset` menyimpan state dan aturan umum, sedangkan perhitungan denda spesifik tetap menjadi tanggung jawab subclass. Rumus progresif adalah `flat + flat * hari / 30`, sehingga hari ke-30 selalu dua kali denda flat.

## Kendala
Pembuatan `Aset` abstrak memerlukan pembaruan subclass agar tidak mengandalkan implementasi denda induk. Ketiga subclass Minggu 3 sudah mengoverride metode ini sehingga perubahan dapat dibatasi pada perhitungan ulang melalui helper induk.

## Penggunaan AI
- Alat yang dipakai: GitHub Copilot.
- Bagian yang dibantu AI: memeriksa instruksi dan tes Minggu 5, mengubah `Aset` menjadi abstrak, menerapkan aturan interface dan strategi denda, serta mencatat asumsi rumus progresif.
- Prompt utama: "Kerjakan Minggu 5 sesuai docs/minggu-05.md dan kebijakan AI, jangan ubah pom.xml/dependency/tes/aset pinjam, jalankan tes mingguan, dan jangan commit sebelum perubahan disetujui."
- Yang saya ubah atau tolak dari saran AI: saya menerima perubahan pada `Aset.java` dan refactor ketiga subclass karena memang diminta Minggu 5; saya tidak mengubah file tes atau konfigurasi proyek.
- Satu hal yang saya pahami lebih baik sekarang: abstract class dapat menyimpan perilaku umum sekaligus mewajibkan subclass mengimplementasikan perhitungan yang benar-benar berbeda.
