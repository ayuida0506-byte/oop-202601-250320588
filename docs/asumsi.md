# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

## A-01: batas waktu bentrok
- Pertanyaan: Apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok?
- Keputusan: Tidak bentrok; rentang diperlakukan sebagai interval setengah terbuka `[mulai, selesai)`.
- Alasan: Waktu selesai satu peminjaman dapat menjadi waktu mulai peminjaman berikutnya tanpa dua pemakaian aset yang bersamaan.
- Dampak ke kode: `JadwalPeminjaman.bentrok(Peminjaman)` hanya mengembalikan true saat interval benar-benar beririsan.
- Tes yang membuktikan: `BatasBentrokTest.selesaiSamaDenganMulai` seharusnya dibuat, tetapi tetap tidak diubah sesuai larangan eksplisit tidak mengubah file tes.

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

## A-08: Rumus denda progresif
- Pertanyaan: Bagaimana menghitung DendaProgresif tanpa melanggar aturan tidak turun dan selalu paling tidak sama dengan flat?
- Keputusan: `progresif = flat + (flat * hariTerlambat / 30)` untuk hari 1 sampai 30.
- Alasan: Rumus linear menentukan nilai hari ke-30 sebesar dua kali flat dan tetap tidak turun saat hari bertambah; pembulatan integer menjaga hasil rupiah.
- Dampak ke kode: `DendaProgresif.hitung(Aset, int)` dan validasi hari diwarisi dari `aset.hitungDenda(hari)`.
- Tes yang membuktikan: `Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal`.

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.
