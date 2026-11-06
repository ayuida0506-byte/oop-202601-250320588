package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;
import java.util.function.Function;

/** Minggu 1, gaya FUNGSIONAL: fungsi sebagai nilai (lambda), tanpa state yang berubah. */
public final class HelloFungsional {

    private HelloFungsional() {
    }

    /** Lambda menangkap NIM dan menghasilkan fungsi sapaan berdasarkan nama. */
    public static Function<String, String> pembuatSapaan(String nim) {
        return nama -> "Aset-Pinjam | Nama: " + nama + ", NIM: " + nim;
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(pembuatSapaan(v.nim).apply(v.nama));
    }
}
