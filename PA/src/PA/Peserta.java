/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

import static PA.Admin.jadwal_lokasi;
import static PA.Main.menu_utama;
import static PA.Petugas_Vaksin.anak;
import static PA.Petugas_Vaksin.centerString;
import static PA.Petugas_Vaksin.dewasa;
import static PA.Petugas_Vaksin.riwayat_vaksin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */

// ABSTRACT CLASS
public class Peserta extends User implements Pantau_Informasi_Vaksinasi{
    // PROPERTY
    protected long NIK;
    protected String tgl_lahir;
    
    // CONSTRUCTOR
    public Peserta(String nama, String jenis_kelamin, long NIK, String tgl_lahir, int usia, String alamat){
        this.NIK = NIK;
        this.tgl_lahir = tgl_lahir;
    }
    
    // OVERLOADING
    public Peserta(){
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
    
    // IMPLEMENTASI DARI ABSTRACT METHOD
    @Override
    public void tambah_data(){
        System.out.println("--------------- Peserta Vaksin Baru Telah Berhasil Ditambahkan ! -----------------");
    }
    
    @Override
    public void ubah_data(){
        System.out.println("----------------- Peserta Vaksin Baru Telah Berhasil Diubah ! --------------------");
    }
    
    @Override
    public void hapus_data(){
        System.out.println("----------------- Peserta Vaksin Baru Telah Berhasil Dihapus ! -------------------");
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    public static void tampil_peserta_anak() {
        if (anak.isEmpty()){
            System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
            System.out.println(" ");
        } else {
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-            DATA PESERTA VAKSINASI COVID-19             -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            // size == ukuran / panjang array list
            for (int i = 0; i < anak.size(); i++) {
                String out = centerString(82, "Peserta Vaksin Anak ke - " + (i+1));
                System.out.println(out);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                   DATA IDENTITAS DIRI                    -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                //karena index itu 0 maka ditambah 1
                // get == mengambil data dari array list
                System.out.println("Nama Lengkap             : " + anak.get(i).getNama().toUpperCase());
                System.out.println("Jenis Kelamin            : " + anak.get(i).getJenis_kelamin().toUpperCase());
                System.out.println("NIK                      : " + anak.get(i).getNIK());
                System.out.println("Tanggal Lahir            : " + anak.get(i).getTgl_lahir().toUpperCase());
                System.out.println("Usia                     : " + anak.get(i).getUsia() + " Tahun");
                System.out.println("Alamat                   : " + anak.get(i).getAlamat().toUpperCase());
                System.out.println("Nama Orang Tua           : " + anak.get(i).getNama_ortu().toUpperCase());
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                 DATA RIWAYAT VAKSINASI                   -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("Status  Vaksinasi        : " + riwayat_vaksin.get(i).getStatus().toUpperCase());
                System.out.println("Jenis   Vaksin Terakhir  : " + riwayat_vaksin.get(i).getJenis_vaksin().toUpperCase());
                System.out.println("Dosis   Vaksin Terakhir  : " + riwayat_vaksin.get(i).getDosis());
                System.out.println("Tanggal Vaksin Terakhir  : " + riwayat_vaksin.get(i).getTgl_vaksinasi());
                System.out.println("Lokasi  Vaksin Terakhir  : " + riwayat_vaksin.get(i).getLokasi_vaksinasi().toUpperCase());
                System.out.println("==================================================================================");
                System.out.println(" ");
            }
        }
    }
    
    public static void tampil_peserta_dewasa(){
        if (dewasa.isEmpty()){
            System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
            System.out.println(" ");
        } else {
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-            DATA PESERTA VAKSINASI COVID-19             -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            // size == ukuran / panjang array list
            for (int i = 0; i < dewasa.size(); i++) {
                String out = centerString(82, "Peserta Vaksin Dewasa ke - " + (i+1));
                System.out.println(out);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                   DATA IDENTITAS DIRI                    -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                //karena index itu 0 maka ditambah 1
                // get == mengambil data dari array list
                System.out.println("Nama Lengkap             : " + dewasa.get(i).getNama().toUpperCase());
                System.out.println("Jenis Kelamin            : " + dewasa.get(i).getJenis_kelamin().toUpperCase());
                System.out.println("NIK                      : " + dewasa.get(i).getNIK());
                System.out.println("Tanggal Lahir            : " + dewasa.get(i).getTgl_lahir().toUpperCase());
                System.out.println("Usia                     : " + dewasa.get(i).getUsia() + " Tahun");
                System.out.println("Alamat                   : " + dewasa.get(i).getAlamat().toUpperCase());
                System.out.println("No. Telpon               : " + dewasa.get(i).getNo_telp().toUpperCase());
                System.out.println("Email                    : " + dewasa.get(i).getEmail().toUpperCase());
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                 DATA RIWAYAT VAKSINASI                   -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("Status  Vaksinasi        : " + riwayat_vaksin.get(i).getStatus().toUpperCase());
                System.out.println("Jenis   Vaksin Terakhir  : " + riwayat_vaksin.get(i).getJenis_vaksin().toUpperCase());
                System.out.println("Dosis   Vaksin Terakhir  : " + riwayat_vaksin.get(i).getDosis());
                System.out.println("Tanggal Vaksin Terakhir  : " + riwayat_vaksin.get(i).getTgl_vaksinasi());
                System.out.println("Lokasi  Vaksin Terakhir  : " + riwayat_vaksin.get(i).getLokasi_vaksinasi().toUpperCase());
                System.out.println("==================================================================================");
                System.out.println(" ");
            }
        }
    }
    
    // ENCAPSULASI (Penggunaan GETTER untuk mengambil data)
    public void tampil_peserta() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-       MENU TAMPIL DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println("|                     1. Data Peserta Vaksinasi   [ANAK-ANAK]                    |");
        System.out.println("|                     2. Data Peserta Vaksinasi   [DEWASA]                       |");
        System.out.println("==================================================================================");
        try {
            System.out.print("                            Masukkan Pilihan Anda : ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.println("==================================================================================");
            System.out.println(" ");
            switch (pilihan) {
                case 1 -> {
                    tampil_peserta_anak();
                    break;
                }


                case 2 -> {
                    tampil_peserta_dewasa();
                    break;
                }

                default -> {
                    System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                    break;
                }
            }
        } catch(NumberFormatException ex){ // handle your exception
                System.out.println("==================================================================================");
                System.out.println("");
                System.out.println("------------------------- Hanya Menerima Inputan Angka ! -------------------------");
                System.out.println("");
        }
    }
    
    public void tampil_jadwal_lokasi() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-     MENU TAMPIL JADWAL & LOKASI VAKSINASI COVID-19     -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println(" ");
        if (jadwal_lokasi.isEmpty()){
            System.out.println("-------------- Informasi Jadwal & Lokasi Vaksinasi COVID-19 Kosong ! -------------");
            System.out.println(" ");
        } else {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("+-+-+-+-+-+-   DAFTAR INFORMASI JADWAL & LOKASI VAKSINASI COVID-19    -+-+-+-+-+-+");
            System.out.println("----------------------------------------------------------------------------------");
            for (int i = 0; i < jadwal_lokasi.size(); i++) {
                //karena index itu 0 maka ditambah 1
                // get == mengambil data dari array list
                System.out.println("----------------------------------------------------------------------------------");
                String out = centerString(82, "Informasi Jadwal & Lokasi ke - " + (i+1));
                System.out.println(out);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("No. Pos Vaksinasi               : " + jadwal_lokasi.get(i).getNo_pos());
                System.out.println("Jadwal Pelaksanaan Vaksinasi    : " + jadwal_lokasi.get(i).getJadwal().toUpperCase());
                System.out.println("Tempat Pelaksanaan Vaksinasi    : " + jadwal_lokasi.get(i).getTempat().toUpperCase());
                System.out.println("Kelurahan Pelaksanaan Vaksinasi : " + jadwal_lokasi.get(i).getKelurahan().toUpperCase());
                System.out.println("Nama Petugas Vaksin             : " + jadwal_lokasi.get(i).getNama_petugas_vaksin().toUpperCase());
                System.out.println("==================================================================================");
            }
            System.out.println(" ");
        }
    }
    
    @Override
    public void informasi_vaksin() throws IOException {
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-         MENU TAMPIL INFORMASI VAKSINASI COVID-19       -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println("|               1. Informasi Peserta Pendaftar Vaksinasi                         |");
        System.out.println("|               2. Informasi Jadwal & Lokasi Pelaksanaan Vaksinasi               |");
        System.out.println("==================================================================================");
        System.out.print("                            Masukkan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.println(" ");
        switch (pilihan) {
            case 1 -> tampil_peserta();
            case 2 -> tampil_jadwal_lokasi();
            default -> {
                System.out.println("-------------------- Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------");
                System.out.println(" ");
            }
        }
    }
    
    @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-+-+-+-          MENU PESERTA VAKSINASI            -+-+-+-+-+-+-+-+-+|");
            System.out.println("|+-+-+-+-+-+-          PEMANTAUAN INFORMASI VAKSINASI COVID-19       -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            System.out.println("|                   1. Tampil Informasi Seputar Vaksinasi   [READ]               |");
            System.out.println("|                   2. Kembali ke Menu Utama                                     |");
            System.out.println("==================================================================================");
            try {
                System.out.print("                            Masukkan Pilihan Anda : ");
                int pilihan = Integer.parseInt(br.readLine());
                System.out.println("==================================================================================");
                System.out.println(" ");
                switch (pilihan) {
                    case 1:
                        informasi_vaksin();
                        break;
                    case 2:
                        menu_utama();
                    default:
                        System.out.println("-------------------- Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------");
                        System.out.println(" ");
                        break;
                }
            } catch(NumberFormatException ex){ // handle your exception
                System.out.println("==================================================================================");
                System.out.println("");
                System.out.println("------------------------- Hanya Menerima Inputan Angka ! -------------------------");
                System.out.println("");
            }
        }
    }
}
