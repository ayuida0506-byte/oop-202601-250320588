package id.ac.upb.asetpinjam.minggu01;

public class HelloProsedural {

    /** Gaya prosedural memakai fungsi statis tanpa menyimpan state. */
    public static String sapa(String nama, String nim) {
        return "Aset-Pinjam | Nama: " + nama + ", NIM: " + nim;
    }

    public static void main(String[] args) {
        String nama = "Ayu Ida Nuraini";
        String nim = "250320588";
        System.out.println(sapa(nama, nim));
    }
}