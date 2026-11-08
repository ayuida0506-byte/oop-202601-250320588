package id.ac.upb.asetpinjam.jadwal;

import id.ac.upb.asetpinjam.model.Peminjaman;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Jadwal peminjaman di memori.
 *
 * <p>Minggu 7: bentrok, semuaUrutMulai, perAset, hapus. Minggu 9: ajukan (melempar exception).
 * tambah() DISEDIAKAN dan sengaja TIDAK memeriksa apa pun.
 */
public class JadwalPeminjaman {

    private final List<Peminjaman> daftar = new ArrayList<>();
    private final int kuotaLaptop;

    public JadwalPeminjaman(int kuotaLaptop) {
        this.kuotaLaptop = kuotaLaptop;
    }

    protected int kuotaLaptop() {
        return kuotaLaptop;
    }

    protected List<Peminjaman> daftarMutable() {
        return daftar;
    }

    /** Menambah apa adanya tanpa pemeriksaan. */
    public void tambah(Peminjaman p) {
        daftar.add(p);
    }

    /** True jika peminjaman baru beririsan dengan jadwal aset yang sama. */
    public boolean bentrok(Peminjaman baru) {
        for (Peminjaman lama : daftar) {
            // Rentang yang menyentuh persis di batas tidak dianggap tumpang tindih.
            boolean asetSama = lama.getAset().getKode().equals(baru.getAset().getKode());
            boolean waktuBeririsan =
                    baru.getMulai().isBefore(lama.getSelesai())
                            && baru.getSelesai().isAfter(lama.getMulai());
            if (asetSama && waktuBeririsan) {
                return true;
            }
        }
        return false;
    }

    /** Mengembalikan salinan peminjaman yang diurutkan menaik menurut waktu mulai. */
    public List<Peminjaman> semuaUrutMulai() {
        return daftar.stream()
                .sorted(Comparator.comparing(Peminjaman::getMulai))
                .toList();
    }

    /** Mengelompokkan peminjaman menurut kode aset. */
    public Map<String, List<Peminjaman>> perAset() {
        Map<String, List<Peminjaman>> hasil = new LinkedHashMap<>();
        for (Peminjaman peminjaman : semuaUrutMulai()) {
            String kodeAset = peminjaman.getAset().getKode();
            hasil.computeIfAbsent(kodeAset, key -> new ArrayList<>()).add(peminjaman);
        }
        return hasil;
    }

    /** TODO minggu 7: hapus peminjaman berdasarkan id. True jika ada yang terhapus. */
    public boolean hapus(String id) {
        return daftar.removeIf(peminjaman -> peminjaman.getId().equals(id));
    }

    /**
     * TODO minggu 9: periksa lalu tambahkan.
     * Bentrok: PeminjamanBentrokException. Peminjam sudah memegang {@link #kuotaLaptop()} laptop yang
     * aktif (status DISETUJUI atau DIPINJAM) dan mengajukan laptop lagi: KuotaHabisException.
     */
    public void ajukan(Peminjaman baru) {
        throw new UnsupportedOperationException("TODO minggu 9: ajukan");
    }
}
