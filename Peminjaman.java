package model;

public class Peminjaman {
    private int id;
    private String nama;
    private String nim;
    private String departemen;
    private String barang;
    private int jumlah;
    private String kondisiBarang;

    // Constructor
    public Peminjaman(int id, String nama, String nim, String departemen, String barang, int jumlah, String kondisiBarang) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.departemen = departemen;
        this.barang = barang;
        this.jumlah = jumlah;
        this.kondisiBarang = kondisiBarang;
    }

    // Getter & Setter
    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getDepartemen() { return departemen; }
    public String getBarang() { return barang; }
    public int getJumlah() { return jumlah; }
    public String getKondisiBarang() { return kondisiBarang; }
}
