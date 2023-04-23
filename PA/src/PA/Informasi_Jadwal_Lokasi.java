/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PA;

import java.io.IOException;

/**
 *
 * @author ASUS
 */
public interface Informasi_Jadwal_Lokasi {
    void menu() throws IOException;
    void tambah_jadwal_lokasi() throws IOException;
    void tampil_jadwal_lokasi() throws IOException;
    void edit_jadwal_lokasi() throws IOException;
    void hapus_jadwal_lokasi() throws IOException; 
}
