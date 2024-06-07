/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian;

/**
 *
 * @author ammar
 */
// File: m_kabupaten.java
public class m_kabupaten {
    private int id_kabupaten;
    private int id_provinsi;
    private String nama_kabupaten;

    // Constructor
    public m_kabupaten(int id_kabupaten, int id_provinsi, String nama_kabupaten) {
        this.id_kabupaten = id_kabupaten;
        this.id_provinsi = id_provinsi;
        this.nama_kabupaten = nama_kabupaten;
    }

    // Getters
    public int getId_kabupaten() {
        return id_kabupaten;
    }

    public int getId_provinsi() {
        return id_provinsi;
    }

    public String getNama_kabupaten() {
        return nama_kabupaten;
    }
}

