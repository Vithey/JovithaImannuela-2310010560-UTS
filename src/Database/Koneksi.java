/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Koneksi {
    private static Connection koneksi;
    private static final String URL = "jdbc:sqlite:buku_alamat.db";

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                // Mendaftarkan driver JDBC SQLite
                Class.forName("org.sqlite.JDBC");
                
                // Membuat koneksi ke database
                koneksi = DriverManager.getConnection(URL);
                System.out.println("Koneksi berhasil!");
                
                // Memastikan tabel 'kontak' ada
                buatTabelJikaBelumAda(koneksi);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Driver SQLite tidak ditemukan: " + e.getMessage());
                System.err.println("Driver SQLite tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal terhubung ke database: " + e.getMessage());
                System.err.println("Gagal terhubung ke database: " + e.getMessage());
            }
        }
        return koneksi;
    }
    
    // Metode untuk membuat tabel 'kontak' jika belum ada
    private static void buatTabelJikaBelumAda(Connection conn) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS kontak (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "nama TEXT NOT NULL, " +
                         "telepon TEXT, " +
                         "email TEXT, " +
                         "alamat TEXT, " +
                         "properti TEXT, " +
                         "keterangan TEXT)";
            stmt.execute(sql);
            System.out.println("Koneksi Berhasil");
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }
    
    // Metode utama untuk pengujian
    public static void main(String[] args) {
        getKoneksi(); // Uji koneksi
    }
}
