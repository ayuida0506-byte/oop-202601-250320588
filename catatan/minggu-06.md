# Catatan Minggu 6: UML dan SOLID

## Yang saya kerjakan
Saya membuat class diagram dan sequence diagram PlantUML berdasarkan struktur kode, serta dokumentasi minimal dua prinsip SOLID.

## Keputusan desain
Diagram menampilkan hierarki `Aset`, tiga subclass, hubungan peminjaman, jadwal in-memory, dan dua strategi denda. Diagram sengaja dibatasi pada relasi yang sudah ada agar konsisten dengan implementasi saat ini.

## Kendala
Tidak ada kendala implementasi utama. Beberapa metode Minggu 9–11 belum tersedia; diagram tidak menyatakan bahwa metode tersebut sudah berjalan.

## Penggunaan AI
- Alat yang dipakai: GitHub Copilot.
- Bagian yang dibantu AI: menyusun diagram class, diagram sequence sukses/bentrok, dan penjelasan SRP, OCP, DIP.
- Prompt utama: "Kerjakan Minggu 6 sesuai docs/minggu-06.md dan kebijakan AI, buat diagram konsisten dengan kode, jangan ubah POM, dependency, atau tes."
- Yang saya ubah atau tolak dari saran AI: saya hanya memodelkan kelas dan relasi yang benar-benar ada saat ini, dan saya menolak detail fitur Minggu 9–11 yang belum merupakan implementasi aktif.
- Satu hal yang saya pahami lebih baik sekarang: diagram UML harus berasal dari struktur dan interaksi kode, bukan dari desain ideal yang belum diimplementasikan.
