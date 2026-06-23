package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(
                new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(
                new Kontak("Citra", "0833333", "citra@gmail.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println("\n=== Cari Kontak ===");
        buku.cariKontak("Budi");
        buku.cariKontak("Doni");

        System.out.println("\n=== Hapus Kontak ===");
        buku.hapusKontak("Budi");

        System.out.println("\n=== Setelah Hapus ===");
        buku.tampilkanSemua();

        System.out.println("\n=== Muat dari Berkas ===");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: " +
                bukuLain.jumlahKontak());
    }
}