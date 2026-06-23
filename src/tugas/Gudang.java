package tugas;

import java.util.ArrayList;
import java.io.*;

public class Gudang {

    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang barang) {
        daftar.add(barang);
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Barang ===");

        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " +
                    daftar.get(i).info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter tulis =
                new PrintWriter(new FileWriter(namaBerkas))) {

            for (Barang b : daftar) {
                tulis.println(b.keBaris());
            }

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan: "
                    + e.getMessage());
        }
    }

    public void muatDariBerkas() {
        daftar.clear();

        try (BufferedReader baca =
                new BufferedReader(new FileReader(namaBerkas))) {

            String baris;

            while ((baris = baca.readLine()) != null) {
                String[] bagian = baris.split(";");

                if (bagian.length == 3) {
                    daftar.add(
                        new Barang(
                            bagian[0],
                            Double.parseDouble(bagian[1]),
                            Integer.parseInt(bagian[2])
                        )
                    );
                }
            }

            System.out.println("Data berhasil dimuat.");

        } catch (IOException e) {
            System.out.println("Gagal memuat: "
                    + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;

        for (Barang b : daftar) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}