package id.ac.upb.asetpinjam.minggu01;

public class HelloOOP {
    // Data identitas disimpan sebagai field privat milik objek.
    private String nama;
    private String nim;

    public static void main(String[] args) {
        HelloOOP h = new HelloOOP("Ayu Ida Nuraini", "250320588");
        System.out.println(h.sapa());
    }

    public HelloOOP(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String sapa() {
        return "Aset-Pinjam | Nama: " + this.nama + ", NIM: " + this.nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}