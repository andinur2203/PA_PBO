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

public interface Data_Diri_Peserta {
    void menu() throws IOException;
    void tambah_peserta() throws IOException;
    void tampil_peserta() throws IOException;
    void edit_peserta() throws IOException;
    void hapus_peserta() throws IOException;           
}
