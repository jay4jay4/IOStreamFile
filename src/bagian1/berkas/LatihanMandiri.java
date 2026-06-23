package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {

        // 1. Memeriksa laporan.txt
        File laporan = new File("laporan.txt");
        System.out.println("=== Soal 1 ===");
        System.out.println("Apakah laporan.txt ada? " + laporan.exists());

        if (laporan.exists()) {
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        }

        // 2. Membuat folder arsip
        File arsip = new File("arsip");
        System.out.println("\n=== Soal 2 ===");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // 3. Membuat dan menghapus sementara.txt
        File sementara = new File("sementara.txt");
        System.out.println("\n=== Soal 3 ===");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus: " + sementara.exists());

            if (sementara.delete()) {
                System.out.println("Berkas berhasil dihapus.");
            } else {
                System.out.println("Berkas gagal dihapus.");
            }

            System.out.println("Sesudah dihapus: " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}