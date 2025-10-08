package service;

import database.Koneksi;
import model.Peminjaman;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD {

    // CREATE
    public void tambahData(Peminjaman p) {
        String sql = "INSERT INTO peminjaman (nama, nim, departemen, barang, jumlah, kondisi_barang) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNama());
            stmt.setString(2, p.getNim());
            stmt.setString(3, p.getDepartemen());
            stmt.setString(4, p.getBarang());
            stmt.setInt(5, p.getJumlah());
            stmt.setString(6, p.getKondisiBarang());
            stmt.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
    }

    // READ
    public List<Peminjaman> tampilData() {
        List<Peminjaman> list = new ArrayList<>();
        String sql = "SELECT * FROM peminjaman";
        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Peminjaman(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("nim"),
                    rs.getString("departemen"),
                    rs.getString("barang"),
                    rs.getInt("jumlah"),
                    rs.getString("kondisi_barang")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal menampilkan data: " + e.getMessage());
        }
        return list;
    }

    // UPDATE
    public void updateData(int id, String kondisiBaru) {
        String sql = "UPDATE peminjaman SET kondisi_barang = ? WHERE id = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kondisiBaru);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Data berhasil diperbarui!");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // DELETE
    public void hapusData(int id) {
        String sql = "DELETE FROM peminjaman WHERE id = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Data berhasil dihapus!");
        } catch (SQLException e) {
            System.out.println("Gagal hapus: " + e.getMessage());
        }
    }
}

