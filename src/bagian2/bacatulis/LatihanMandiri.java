package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiri {
    public static void main(String[] args) {

        String namaBerkas = "hari.txt";

        try {
            // 1. Menulis 5 nama hari
            BufferedWriter tulis = new BufferedWriter(new FileWriter(namaBerkas));

            tulis.write("Senin");
            tulis.newLine();
            tulis.write("Selasa");
            tulis.newLine();
            tulis.write("Rabu");
            tulis.newLine();
            tulis.write("Kamis");
            tulis.newLine();
            tulis.write("Jumat");

            tulis.close();

            System.out.println("=== Isi Awal hari.txt ===");
            tampilkanIsi(namaBerkas);

            // 2. Menambahkan 2 nama hari (append)
            BufferedWriter tambah = new BufferedWriter(new FileWriter(namaBerkas, true));

            tambah.newLine();
            tambah.write("Sabtu");
            tambah.newLine();
            tambah.write("Minggu");

            tambah.close();

            System.out.println("\n=== Setelah Ditambah ===");
            tampilkanIsi(namaBerkas);

            // 3. Menghitung jumlah baris
            BufferedReader baca = new BufferedReader(new FileReader(namaBerkas));

            int jumlahBaris = 0;
            while (baca.readLine() != null) {
                jumlahBaris++;
            }

            baca.close();

            System.out.println("\nJumlah baris dalam berkas: " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Method untuk menampilkan isi berkas
    public static void tampilkanIsi(String namaBerkas) throws IOException {
        BufferedReader baca = new BufferedReader(new FileReader(namaBerkas));

        String baris;
        while ((baris = baca.readLine()) != null) {
            System.out.println(baris);
        }

        baca.close();
    }
}