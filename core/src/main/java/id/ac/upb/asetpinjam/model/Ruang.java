package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa ruang. Kapasitas harus lebih dari 0 (IllegalArgumentException). */
public class Ruang extends Aset {

    // Kapasitas adalah data khusus Ruang, jadi disimpan pada subclass.
    private final int kapasitas;

    public Ruang(String kode, String nama, int kapasitas) {
        super(kode, nama);
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas harus lebih dari 0");
        }
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.RUANG;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        // Ruang memakai multiplier dasar 1, sehingga mengikuti tarif induk.
        return super.hitungDenda(hariTerlambat);
    }
}
