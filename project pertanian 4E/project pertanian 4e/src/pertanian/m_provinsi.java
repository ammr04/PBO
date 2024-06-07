/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertanian;

/**
 *
 * @author ammar
 */
// File: m_provinsi.java
public class m_provinsi {
    private int id_provinsi;
    private String nama_provinsi;

    // Constructor
    public m_provinsi(int id_provinsi, String nama_provinsi) {
        this.id_provinsi = id_provinsi;
        this.nama_provinsi = nama_provinsi;
    }

    // Getters
    public int getId_provinsi() {
        return id_provinsi;
    }

    public String getNama_provinsi() {
        return nama_provinsi;
    }
}
