/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

/**
 *
 * @author ASUS
 */

// CLASS
public class Jadwal_Lokasi {
    // PROPERTY
    protected int no_pos;
    protected String jadwal, tempat, kelurahan, nama_petugas_vaksin;
    
    // CONSTRUCTOR
    public Jadwal_Lokasi(int no_pos, String jadwal, String tempat, String kelurahan, String nama_petugas_vaksin) {
        this.no_pos = no_pos;
        this.jadwal = jadwal;
        this.tempat = tempat;
        this.kelurahan = kelurahan;
        this.nama_petugas_vaksin = nama_petugas_vaksin;
    }
    
    // GETTER AND SETTER
    public int getNo_pos() {
        return no_pos;
    }

    public void setNo_pos(int no_pos) {
        this.no_pos = no_pos;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getNama_petugas_vaksin() {
        return nama_petugas_vaksin;
    }

    public void setNama_petugas_vaksin(String nama_petugas_vaksin) {
        this.nama_petugas_vaksin = nama_petugas_vaksin;
    }
    
    // METHOD
    public void tambah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-      INFORMASI JADWAL DAN LOKASI DENGAN KETERANGAN     -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   No. Pos             : " + this.no_pos);
        System.out.println("   Jadwal              : " + this.jadwal);
        System.out.println("   Tempat              : " + this.tempat);
        System.out.println("   Kelurahan           : " + this.kelurahan);        
        System.out.println("   Nama Petugas Vaksin : " + this.nama_petugas_vaksin);
        System.out.println("------------------------- Telah Berhasil Ditambahkan ! ---------------------------");
        System.out.println(" ");
    }
    
    public void ubah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-      INFORMASI JADWAL DAN LOKASI DENGAN KETERANGAN     -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   No. Pos             : " + this.no_pos);
        System.out.println("   Jadwal              : " + this.jadwal);
        System.out.println("   Tempat              : " + this.tempat);
        System.out.println("   Kelurahan           : " + this.kelurahan);        
        System.out.println("   Nama Petugas Vaksin : " + this.nama_petugas_vaksin);
        System.out.println("--------------------------- Telah Berhasil Diubah ! ------------------------------");
        System.out.println(" ");
    }
    
    public void hapus_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-      INFORMASI JADWAL DAN LOKASI DENGAN KETERANGAN     -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   No. Pos             : " + this.no_pos);
        System.out.println("   Jadwal              : " + this.jadwal);
        System.out.println("   Tempat              : " + this.tempat);
        System.out.println("   Kelurahan           : " + this.kelurahan);        
        System.out.println("   Nama Petugas Vaksin : " + this.nama_petugas_vaksin);
        System.out.println("--------------------------- Telah Berhasil Dihapus ! -----------------------------");
        System.out.println(" ");
    }
}
