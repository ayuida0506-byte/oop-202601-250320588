# Catatan Minggu 2: Struktur OOP dan Encapsulation

## Yang saya kerjakan
Saya melengkapi class Aset dengan field private, nilai awal, getter/setter, dan validasi.

## Keputusan desain
Kode dibuat final agar tidak dapat diubah setelah konstruktor. Nilai kode dan nama yang hanya berisi spasi ditolak.

## Kendala
Butuh perhatian khusus agar setter gagal tidak mengubah nilai lama.

## Penggunaan AI
- Alat yang dipakai: GitHub Copilot.
- Bagian yang dibantu AI: implementasi encapsulation dan validasi pada class Aset.
- Prompt utama: kerjakan Minggu 2 sesuai docs/minggu-02.md dan kebijakan AI tanpa mengubah POM atau tes.
- Yang saya ubah atau tolak dari saran AI: nilai input tidak dinormalisasi agar tidak mengubah perilaku data yang diberikan.
- Satu hal yang saya pahami lebih baik sekarang: encapsulation mengontrol akses dan menjaga object tetap dalam keadaan valid.
