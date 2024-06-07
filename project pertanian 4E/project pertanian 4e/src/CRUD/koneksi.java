/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ammar
 */
public class koneksi {
    
    private String databaseName="2210010463";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    
    public koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        }
        catch (Exception e) { 
            System.err.println(e.toString());
        }
    }
    
    public void simpanM_Kabupaten(String paramid_kabupaten, String paramid_provinsi,
            String paramnama_kabupaten) {
        
       try {
         String SQL ="INSERT INTO m_kabupaten (id_kabupaten, id_provinsi, nama_kabupaten)"
                 + "VALUE(?,?,?)";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramid_kabupaten);
         perintah.setString(2, paramid_provinsi);
         perintah.setString(3, paramnama_kabupaten);
         perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    
    public void ubahM_Kabupaten(String paramid_kabupaten, String paramid_provinsi,
            String paramnama_kabupaten) {
        
       try {
         String SQL ="UPDATE m_kabupaten SET id_provinsi=?, nama_kabupaten=? WHERE id_kabupaten=?";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramid_provinsi);
         perintah.setString(2, paramnama_kabupaten);
         perintah.setString(3, paramid_kabupaten);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    
    public void hapusM_Kabupaten(String paramid_kabupaten) {
        try {
           String SQL ="DELETE FROM m_kabupaten WHERE id_kabupaten=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramid_kabupaten);
           perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public void simpanM_Provinsi(String paramid_provinsi, String paramnama_provinsi) {
        
       try {
         String SQL ="INSERT INTO m_provinsi (id_provinsi, nama_provinsi)"
                 + "VALUE(?,?)";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramid_provinsi);
         perintah.setString(2, paramnama_provinsi);
         perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    
    public void ubahM_Provinsi(String paramid_provinsi, String paramnama_provinsi) {
        
       try {
         String SQL ="UPDATE m_provinsi SET nama_provinsi=?, WHERE id_provinsi=?";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramnama_provinsi);
         perintah.setString(2, paramid_provinsi);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    
    public void hapusM_Provinsi(String paramid_provinsi) {
        try {
           String SQL ="DELETE FROM m_provinsi WHERE id_provinsi=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramid_provinsi);
           perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public void cariM_Kabupaten(String paramid_kabupaten) {
        try {
           String SQL="SELECT*FROM m_kabupaten WHERE id_kabupaten=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramid_kabupaten);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println("ID KABUPATEN :"+data.getString("id_kabupaten"));
               System.out.println("ID PROVINSI :"+data.getString("id_provinsi"));
               System.out.println("NAMA KABUPATEN :"+data.getString("nama_kabupaten"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public void dataM_Kabupaten() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM m_kabupaten ORDER BY id_kabupaten ASC");
            while(baris.next()) {
                System.out.println(baris.getString("id_kabupaten")+" | "+
                        baris.getString("id_provinsi")+" | "+
                        baris.getString("nama_kabupaten"));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public void cariM_Provinsi(String paramid_provinsi) {
        try {
           String SQL="SELECT*FROM m_provinsi WHERE id_provinsi=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramid_provinsi);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println("ID KABUPATEN :"+data.getString("id_provinsi"));
               System.out.println("ID PROVINSI :"+data.getString("nama_provinsi"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    } 
    
    
    public void dataM_Provinsi() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM m_provinsi ORDER BY id_provinsi ASC");
            while(baris.next()) {
                System.out.println(baris.getString("id_provinsi")+" | "+
                        baris.getString("nama _provinsi"));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


