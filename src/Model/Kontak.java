/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Kontak {
    private int id;
    private String nama;
    private String telepon;
    private String email;
    private String alamat;
    private String properti;
    private String keterangan;

    // 1. Constructor Kosong (Wajib untuk Deserialisasi JSON/IO)
    public Kontak() {
    } 

    // 2. Constructor Penuh
    public Kontak(int id, String nama, String telepon, String email, String alamat, String properti, String keterangan) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
        this.email = email;
        this.alamat = alamat;
        this.properti = properti;
        this.keterangan = keterangan;
    }
    
    // 3. GETTER dan SETTER (Kode Boilerplate)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProperti() {
        return properti;
    }

    public void setProperti(String properti) {
        this.properti = properti;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
