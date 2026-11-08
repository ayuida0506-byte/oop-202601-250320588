package id.ac.upb.asetpinjam.katalog;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/** Katalog aset di memori. tambah() dan semua() DISEDIAKAN; Anda mengerjakan dua overload cari() (minggu 4). */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    /** Pencarian nama memakai Locale.ROOT agar tidak bergantung pada lokal sistem. */
    public List<Aset> cari(String kata) {
        if (kata == null || kata.isBlank()) {
            throw new IllegalArgumentException("Kata pencarian tidak boleh kosong");
        }
        String kataNormal = kata.toLowerCase(Locale.ROOT);
        return daftar.stream()
                .filter(aset -> aset.getNama().toLowerCase(Locale.ROOT).contains(kataNormal))
                .toList();
    }

    /** TODO minggu 4: seperti cari(kata) tetapi hanya untuk jenis yang diminta (overloading). */
    public List<Aset> cari(String kata, JenisAset jenis) {
        if (jenis == null) {
            throw new IllegalArgumentException("Jenis aset tidak boleh null");
        }
        return cari(kata).stream()
                .filter(aset -> aset.getJenis() == jenis)
                .toList();
    }
}
