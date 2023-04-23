/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

/**
 *
 * @author ASUS
 */

// PENERAPAN KEYWORD FINAL PADA CLASS 
public final class Riwayat_Vaksin extends Vaksin{
    // property
    private String lokasi_vaksinasi;
    private String tgl_vaksinasi;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Riwayat_Vaksin(String status, String jenis_vaksin, int dosis, String tgl_vaksinasi, String lokasi_vaksinasi){
        super(status, jenis_vaksin, dosis);        
        this.tgl_vaksinasi = tgl_vaksinasi;
        this.lokasi_vaksinasi = lokasi_vaksinasi;
    }

    public String getLokasi_vaksinasi() {
        return lokasi_vaksinasi;
    }

    public void setLokasi_vaksinasi(String lokasi_vaksinasi) {
        this.lokasi_vaksinasi = lokasi_vaksinasi;
    }

    public String getTgl_vaksinasi() {
        return tgl_vaksinasi;
    }

    public void setTgl_vaksinasi(String tgl_vaksinasi) {
        this.tgl_vaksinasi = tgl_vaksinasi;
    }
  
    // ABSTRACT METHOD
    @Override
    public void tambah_data_anak(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-        DATA RIWAYAT VAKSIN ANAK DENGAN KETERANGAN      -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Status  Vaksin : " + this.status.toUpperCase());
        System.out.println("   Jenis   Vaksin : " + this.jenis_vaksin.toUpperCase());
        System.out.println("   Dosis   Vaksin : " + this.dosis);
        System.out.println("   Tanggal Vaksin : " + this.tgl_vaksinasi.toUpperCase());
        System.out.println("   Lokasi  Vaksin : " + this.lokasi_vaksinasi.toUpperCase());
        System.out.println("------------------------- Telah Berhasil Ditambahkan ! ---------------------------");
        System.out.println(" ");
    }
    
    @Override
    public void ubah_data_anak(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-        DATA RIWAYAT VAKSIN ANAK DENGAN KETERANGAN      -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Status  Vaksin : " + this.status.toUpperCase());
        System.out.println("   Jenis   Vaksin : " + this.jenis_vaksin.toUpperCase());
        System.out.println("   Dosis   Vaksin : " + this.dosis);
        System.out.println("   Tanggal Vaksin : " + this.tgl_vaksinasi.toUpperCase());
        System.out.println("   Lokasi  Vaksin : " + this.lokasi_vaksinasi.toUpperCase());
        System.out.println("--------------------------- Telah Berhasil Diubah ! ------------------------------");
        System.out.println(" ");
    }
    
    @Override
    public void hapus_data_anak(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-        DATA RIWAYAT VAKSIN ANAK DENGAN KETERANGAN      -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Status  Vaksin : " + this.status.toUpperCase());
        System.out.println("   Jenis   Vaksin : " + this.jenis_vaksin.toUpperCase());
        System.out.println("   Dosis   Vaksin : " + this.dosis);
        System.out.println("   Tanggal Vaksin : " + this.tgl_vaksinasi.toUpperCase());
        System.out.println("   Lokasi  Vaksin : " + this.lokasi_vaksinasi.toUpperCase());
        System.out.println("--------------------------- Telah Berhasil Dihapus ! -----------------------------");
        System.out.println(" ");
    }
    
    @Override
    public void tambah_data_dewasa(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-       DATA RIWAYAT VAKSIN DEWASA DENGAN KETERANGAN     -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Status  Vaksin : " + this.status.toUpperCase());
        System.out.println("   Jenis   Vaksin : " + this.jenis_vaksin.toUpperCase());
        System.out.println("   Dosis   Vaksin : " + this.dosis);
        System.out.println("   Tanggal Vaksin : " + this.tgl_vaksinasi.toUpperCase());
        System.out.println("   Lokasi  Vaksin : " + this.lokasi_vaksinasi.toUpperCase());
        System.out.println("------------------------- Telah Berhasil Ditambahkan ! ---------------------------");
        System.out.println(" ");
    }
    
    
    @Override
    public void ubah_data_dewasa(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-       DATA RIWAYAT VAKSIN DEWASA DENGAN KETERANGAN     -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Status  Vaksin : " + this.status.toUpperCase());
        System.out.println("   Jenis   Vaksin : " + this.jenis_vaksin.toUpperCase());
        System.out.println("   Dosis   Vaksin : " + this.dosis);
        System.out.println("   Tanggal Vaksin : " + this.tgl_vaksinasi.toUpperCase());
        System.out.println("   Lokasi  Vaksin : " + this.lokasi_vaksinasi.toUpperCase());
        System.out.println("--------------------------- Telah Berhasil Diubah ! ------------------------------");
        System.out.println(" ");
    }
    
    @Override
    public void hapus_data_dewasa(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("|+-+-+-+-+-+-       DATA RIWAYAT VAKSIN DEWASA DENGAN KETERANGAN     -+-+-+-+-+-+|");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("   Status  Vaksin : " + this.status.toUpperCase());
        System.out.println("   Jenis   Vaksin : " + this.jenis_vaksin.toUpperCase());
        System.out.println("   Dosis   Vaksin : " + this.dosis);
        System.out.println("   Tanggal Vaksin : " + this.tgl_vaksinasi.toUpperCase());
        System.out.println("   Lokasi  Vaksin : " + this.lokasi_vaksinasi.toUpperCase());
        System.out.println("--------------------------- Telah Berhasil Dihapus ! -----------------------------");
        System.out.println(" ");
    }
}
