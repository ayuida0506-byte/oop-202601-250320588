# Penerapan prinsip SOLID

## SRP - Single Responsibility Principle
Setiap kelas pada desain ini memiliki tanggung jawab yang terpisah. `JadwalPeminjaman` mengelola daftar dan operasi jadwal, sedangkan `Peminjaman` menyimpan identitas, aset, peminjam, serta rentang waktu satu transaksi. Untuk denda, `DendaFlat` dan `DendaProgresif` masing-masing hanya bertanggung jawab pada satu cara perhitungan. Pemisahan ini membuat perubahan aturan pencarian atau jadwal tidak otomatis memaksa perubahan pada model transaksi.

## OCP - Open/Closed Principle
`AturanDenda` menjadi kontrak yang dapat diimplementasikan oleh `DendaFlat` dan `DendaProgresif`. Perhitungan baru dapat ditambahkan sebagai implementasi baru tanpa mengubah caller yang menerima `AturanDenda`. Demikian pula `Aset` menyediakan perilaku umum dan mewajibkan subclass menentukan jenis serta multiplier denda, sehingga jenis aset baru dapat ditambahkan melalui subclass baru.

## DIP - Dependency Inversion Principle
Kode Minggu 10 yang menggunakan pola Strategy seharusnya bergantung pada abstraksi `AturanDenda`, bukan pada kelas konkret seperti `DendaFlat`. Pemisahan kontrak ini juga meningkatkan testability karena aturan pengujian dapat memakai strategi tiruan atau implementasi alternatif tanpa mengubah objek aset.

Pada diagram class, `DendaFlat` dan `DendaProgresif` tampak sebagai implementasi interface `AturanDenda`, sedangkan `Ruang`, `Laptop`, dan `AlatLab` adalah turunan `Aset`. Class diagram dan sequence diagram memperlihatkan hubungan yang benar-benar ada pada kode saat ini; diagram tidak mengklaim metode Minggu 9 atau 10 yang masih belum diimplementasikan.
