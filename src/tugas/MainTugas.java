//Nama : Zaini Ramadhan
//NPM  : 2410010149
package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Peralatan"
        };

        System.out.println("=== Kategori Barang ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat gudang
        Gudang gudang = new Gudang("barang.txt");

        // Menambah minimal 5 barang
        gudang.tambahBarang(
                new Barang("Beras", 15000, 20));
        gudang.tambahBarang(
                new Barang("Gula", 18000, 15));
        gudang.tambahBarang(
                new Barang("Teh", 8000, 30));
        gudang.tambahBarang(
                new Barang("Sapu", 25000, 10));
        gudang.tambahBarang(
                new Barang("Sabun", 5000, 50));

        gudang.tampilkanSemua();

        System.out.println("\nTotal Nilai Persediaan: Rp"
                + gudang.totalNilai());

        // Simpan ke berkas
        gudang.simpanKeBerkas();

        System.out.println("\n=== Membaca Kembali Data ===");

        // Membuat objek baru dan memuat data
        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println("\nTotal Nilai Persediaan: Rp"
                + gudangBaru.totalNilai());
    }
}