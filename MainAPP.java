

import model.Peminjaman;
import service.CRUD;
import java.util.List;
import java.util.Scanner;

public class MainAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD crud = new CRUD();
        int pilihan;

        do {
            System.out.println("\n===== MENU PEMINJAMAN BARANG SEKRE =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Departemen: ");
                    String dept = sc.nextLine();
                    System.out.print("Barang: ");
                    String barang = sc.nextLine();
                    System.out.print("Jumlah: ");
                    int jumlah = sc.nextInt(); sc.nextLine();
                    System.out.print("Kondisi Barang: ");
                    String kondisi = sc.nextLine();

                    crud.tambahData(new Peminjaman(0, nama, nim, dept, barang, jumlah, kondisi));
                }
                case 2 -> {
                    List<Peminjaman> list = crud.tampilData();
                    System.out.println("\n=== DATA PEMINJAMAN ===");
                    for (Peminjaman p : list) {
                        System.out.println(p.getId() + " | " + p.getNama() + " | " +p.getNim() + "|" + p.getBarang() + " | " + p.getJumlah() + " | " + p.getKondisiBarang());
                    }
                }
                case 3 -> {
                    System.out.print("Masukkan ID yang ingin diubah: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Masukkan kondisi baru: ");
                    String kondisi = sc.nextLine();
                    crud.updateData(id, kondisi);
                }
                case 4 -> {
                    System.out.print("Masukkan ID yang ingin dihapus: ");
                    int id = sc.nextInt();
                    crud.hapusData(id);
                }
                case 5 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
