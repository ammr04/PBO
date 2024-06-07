/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;
import pertanian.*;
import java.util.Scanner;
import java.util.ArrayList;
import CRUD.koneksi;


/**
 *
 * @author ammar
 */
// File: Main.java
public class Salary {
    
    
    
    public static void main(String[] args) {
        
        koneksi db = new koneksi();
        //db.simpanM_Provinsi("36", "Kalimantan Timur");
        db.ubahM_Kabupaten("102", "37", "Kandangan");
        //db.hapusM_Kabupaten("101");
        //db.simpanM_Provinsi("34", "Kalimantan Selatan");
        //db.ubahM_Provinsi("Jawa Barat", "23");
        //db.hapusM_Provinsi("34");
        //db.cariM_Kabupaten("101");
        //db.dataM_Kabupaten();
        //db.cariM_Provinsi("34");
        //db.dataM_Provinsi();
        
        
//        //Test m_provinsi
//        m_provinsi provinsi = new m_provinsi(1, "Jawa Barat");
//        System.out.println("ID Provinsi: " + provinsi.getId_provinsi());
//        System.out.println("Nama Provinsi: " + provinsi.getNama_provinsi());
//
//        // Test m_kabupaten
//        m_kabupaten kabupaten = new m_kabupaten(101, 1, "Bandung");
//        System.out.println("\nID Kabupaten: " + kabupaten.getId_kabupaten());
//        System.out.println("ID Provinsi: " + kabupaten.getId_provinsi());
//        System.out.println("Nama Kabupaten: " + kabupaten.getNama_kabupaten());
    }
}

