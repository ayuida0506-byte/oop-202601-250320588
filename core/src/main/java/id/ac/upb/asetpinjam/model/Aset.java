package id.ac.upb.asetpinjam.model;

import id.ac.upb.asetpinjam.kontrak.DapatDipinjam;
import id.ac.upb.asetpinjam.config.Varian;

/**
 * Aset yang dapat dipinjam.
 *
 * <p>Minggu 2: lengkapi field, konstruktor, getter/setter, dan validasi (encapsulation).
 * Minggu 3: tambahkan getJenis() di tiap subclass.
 * Minggu 4: hitungDenda() dioverride di tiap subclass.
 * Minggu 5: isi bisaDipinjam() dan ubah menjadi class abstrak
 * (TestSupport.aset(...) di folder test menyesuaikan sendiri, lihat docs/minggu-05.md).
 */
public class Aset implements DapatDipinjam {

    // kode tidak memiliki setter karena identitas aset tidak boleh berubah.
    private final String kode;
    private String nama;
    private StatusAset status;
    private Kondisi kondisi;

    /** Validasi konstruksi memastikan object selalu memiliki kode dan nama yang valid. */
    public Aset(String kode, String nama) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode tidak boleh null atau kosong");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }
        this.kode = kode;
        this.nama = nama;
        this.status = StatusAset.TERSEDIA;
        this.kondisi = Kondisi.BAIK;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public StatusAset getStatus() {
        return status;
    }

    public Kondisi getKondisi() {
        return kondisi;
    }

    /** Setter menolak nilai nama kosong agar state objek tetap valid. */
    public void setNama(String nama) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong");
        }
        this.nama = nama;
    }

    /** Status aset tidak boleh bernilai null. */
    public void setStatus(StatusAset status) {
        if (status == null) {
            throw new IllegalArgumentException("Status tidak boleh null");
        }
        this.status = status;
    }

    /** Kondisi aset tidak boleh bernilai null. */
    public void setKondisi(Kondisi kondisi) {
        if (kondisi == null) {
            throw new IllegalArgumentException("Kondisi tidak boleh null");
        }
        this.kondisi = kondisi;
    }

    /** TODO minggu 5: true hanya jika status TERSEDIA dan kondisi bukan RUSAK_BERAT. */
    @Override
    public boolean bisaDipinjam() {
        throw new UnsupportedOperationException("TODO minggu 5");
    }

    /** Jenis aset ditentukan oleh subclass berdasarkan tipe runtimenya. */
    public JenisAset getJenis() {
        throw new UnsupportedOperationException("TODO minggu 3");
    }

    /** Tarif dasar dipakai induk; subclass mengalikan sesuai jenis aset. */
    public long hitungDenda(int hariTerlambat) {
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("Hari terlambat tidak boleh negatif");
        }
        return (long) hariTerlambat * Varian.aktif().dendaPerHari;
    }
}
