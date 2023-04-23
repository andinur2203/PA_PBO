/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

/**
 *
 * @author ASUS
 */
public class Anak extends User{
    // property
    private long NIK;
    private String tgl_lahir, nama_ortu;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Anak(String nama, String jenis_kelamin, long NIK, String tgl_lahir, int usia, String alamat, String nama_ortu) {
        super(nama, jenis_kelamin, usia, alamat);
        this.NIK = NIK;
        this.tgl_lahir = tgl_lahir;
        this.nama_ortu = nama_ortu;
    }

    // GETTER AND SETTER
    public long getNIK() {
        return NIK;
    }

    public void setNIK(long NIK) {
        this.NIK = NIK;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getNama_ortu() {
        return nama_ortu;
    }

    public void setNama_ortu(String nama_ortu) {
        this.nama_ortu = nama_ortu;
    }
    
    // METHOD
    @Override
    public void tambah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-       DATA DIRI PESERTA VAKSIN ANAK DENGAN IDENTITAS   -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama            : " + this.nama.toUpperCase());
        System.out.println("   NIK             : " + this.NIK);
        System.out.println("   Nama Orang Tua  : " + this.nama_ortu);
        System.out.println("------------------------- Telah Berhasil Ditambahkan ! ---------------------------");
        System.out.println(" ");
    }
    
     @Override
    public void ubah_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-       DATA DIRI PESERTA VAKSIN ANAK DENGAN IDENTITAS   -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama            : " + this.nama.toUpperCase());
        System.out.println("   NIK             : " + this.NIK);
        System.out.println("   Nama Orang Tua  : " + this.nama_ortu);
        System.out.println("--------------------------- Telah Berhasil Diubah ! ------------------------------");
        System.out.println(" ");
    }
    
     @Override
    public void hapus_data(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-       DATA DIRI PESERTA VAKSIN ANAK DENGAN IDENTITAS   -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Nama            : " + this.nama.toUpperCase());
        System.out.println("   NIK             : " + this.NIK);
        System.out.println("   Nama Orang Tua  : " + this.nama_ortu);
        System.out.println("--------------------------- Telah Berhasil Dihapus ! -----------------------------");
        System.out.println(" ");
    }             
}
