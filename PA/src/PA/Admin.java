/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

import static PA.Main.menu_utama;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
// CLASS
public class Admin extends User implements Data_Diri_Peserta{
    // PROPERTY
    private long NIP;
    
    // CONSTRUCTOR
    public Admin (String nama, String jenis_kelamin, long NIP, int usia, String alamat) {
        super(nama, jenis_kelamin, usia, alamat);
        this.NIP = NIP;
    }
    
    // OVERLOADING
    public Admin (){
    }
   
    // GETTER AND SETTER (ENCAPSULASI)
    public long getNIP() {
        return NIP;
    }

    public void setNIP(long NIP) {
        this.NIP = NIP;
    }

    // IMPLEMENTASI DARI ABSTRACT METHOD
    @Override
    public void tambah_data(){
        System.out.println("~ Administrator Telah Berhasil Menambahkan Data Diri & Riwayat Vaksin Peserta ! ~~");
    }
    
    @Override
    public void ubah_data(){
        System.out.println("~~~ Administrator Telah Berhasil Mengubah Data Diri & Riwayat Vaksin Peserta ! ~~~");
    }
    
    @Override
    public void hapus_data(){
        System.out.println("~~ Administrator Telah Berhasil Menghapus Data Diri & Riwayat Vaksin Peserta ! ~~~");
    }
    
    // AGAR OUTPUT RATA TENGAH
    public static String centerString (int width, String s) {
        return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Anak> anak = new ArrayList<>();
    static ArrayList<Dewasa> dewasa = new ArrayList<>();
    static ArrayList<Riwayat_Vaksin> riwayat_vaksin = new ArrayList<>();
    
    // IMPLEMENTASI METHOD DARI INTERFACE Data_Diri_Peserta
    @Override
    public void tambah_peserta() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-       MENU TAMBAH DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println("|                     1. Data Peserta Vaksinasi   [ANAK-ANAK]                    |");
        System.out.println("|                     2. Data Peserta Vaksinasi   [DEWASA]                       |");
        System.out.println("==================================================================================");
        System.out.print("                            Masukkan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.println(" ");
        switch (pilihan) {
            case 1 -> {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                   DATA IDENTITAS DIRI                    -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.print("Masukkan Nama Lengkap                  : ");
                String nama_anak = br.readLine();
                System.out.print("Masukkan Jenis Kelamin (L/P)           : ");
                String JK_anak = br.readLine();
                System.out.print("Masukkan NIK                           : ");
                long NIK_anak;
                NIK_anak = Long.parseLong(br.readLine());
                System.out.print("Masukkan Tanggal Lahir                 : ");
                String tgl_lahir_anak = br.readLine();
                System.out.print("Masukkan Usia                          : ");
                int usia_anak = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Alamat                        : ");
                String alamat_anak = br.readLine();
                System.out.print("Masukkan Nama Orang Tua                : ");
                String ortu_anak = br.readLine();
                System.out.println("==================================================================================");
                System.out.println(" ");
                
                Anak ankBaru = new Anak(nama_anak, JK_anak, NIK_anak, tgl_lahir_anak, usia_anak, alamat_anak, ortu_anak);             
                anak.add(ankBaru);
                ankBaru.tambah_data();
                
                System.out.println(" ");
                System.out.println("------------------- Silahkan Lengkapi Data Riwayat Vaksinasi ! -------------------");
                String out = centerString(82, " Saudara/i " + nama_anak.toUpperCase());
                System.out.println(out);
                System.out.println(" ");
                
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                 DATA RIWAYAT VAKSINASI                   -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.print("Masukkan Jenis Vaksin Terakhir         : ");
                String JV_anak = br.readLine();
                System.out.print("Masukkan Dosis Vaksin Terakhir (1/2/3) : ");
                int DV_anak = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Tanggal Vaksin Terakhir       : ");
                String tgl_vaksin_anak = br.readLine();
                System.out.print("Masukkan Lokasi Vaksin Terakhir        : ");
                String lokasi_vaksin_anak = br.readLine();
                System.out.println("==================================================================================");
                System.out.println(" ");
         
                Riwayat_Vaksin riwayat_vksBaru = new Riwayat_Vaksin("COVID-19", JV_anak, DV_anak, tgl_vaksin_anak, lokasi_vaksin_anak);
                riwayat_vaksin.add(riwayat_vksBaru);
                riwayat_vksBaru.tambah_data_anak();
                tambah_data();
                System.out.println(" ");
                break;
            }
            
            case 2 -> {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                   DATA IDENTITAS DIRI                    -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.print("Masukkan Nama Lengkap                  : ");
                String nama_dewasa = br.readLine();
                System.out.print("Masukkan Jenis Kelamin (L/P)           : ");
                String JK_dewasa = br.readLine();
                System.out.print("Masukkan NIK                           : ");
                long NIK_dewasa;
                NIK_dewasa = Long.parseLong(br.readLine());
                System.out.print("Masukkan Tanggal Lahir                 : ");
                String tgl_lahir_dewasa = br.readLine();
                System.out.print("Masukkan Usia                          : ");
                int usia_dewasa = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Alamat                        : ");
                String alamat_dewasa = br.readLine();
                System.out.print("Masukkan No. Telp                      : ");
                String no_telp = br.readLine();
                System.out.print("Masukkan Email                         : ");
                String email = br.readLine();
                System.out.println("==================================================================================");
                System.out.println(" ");
                                
                Dewasa dwsBaru = new Dewasa(nama_dewasa, JK_dewasa, NIK_dewasa, tgl_lahir_dewasa, usia_dewasa, alamat_dewasa, no_telp, email);
                dewasa.add(dwsBaru);
                dwsBaru.tambah_data();
                
                System.out.println(" ");
                System.out.println("------------------- Silahkan Lengkapi Data Riwayat Vaksinasi ! -------------------");
                String out = centerString(82, " Saudara/i " + nama_dewasa.toUpperCase());
                System.out.println(out);
                System.out.println(" ");
                
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("+-+-+-+-+-+-                 DATA RIWAYAT VAKSINASI                   -+-+-+-+-+-+");
                System.out.println("----------------------------------------------------------------------------------");
                System.out.print("Masukkan Jenis Vaksin Terakhir         : ");
                String JV_dewasa = br.readLine();
                System.out.print("Masukkan Dosis Vaksin Terakhir (1/2/3) : ");
                int DV_dewasa = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Tanggal Vaksin Terakhir       : ");
                String tgl_vaksin_dewasa = br.readLine();
                System.out.print("Masukkan Lokasi Vaksin Terakhir        : ");
                String lokasi_vaksin_dewasa = br.readLine();
                System.out.println("==================================================================================");
                System.out.println(" ");
                              
                Riwayat_Vaksin riwayat_vksBaru = new Riwayat_Vaksin("COVID-19", JV_dewasa, DV_dewasa, tgl_vaksin_dewasa, lokasi_vaksin_dewasa);
                riwayat_vaksin.add(riwayat_vksBaru);
                riwayat_vksBaru.tambah_data_dewasa();
                tambah_data();
                System.out.println(" ");
                break;
            }
            
            default -> {
                System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                
                break;
            }
        }
    }
    
    // PENERAPAN KEYWORD STATIC
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
    
    // PENERAPAN KEYWORD STATIC
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
    
    // IMPLEMENTASI METHOD DARI INTERFACE Data_Diri_Peserta
    @Override
    public void tampil_peserta() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-       MENU TAMPIL DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println("|                     1. Data Peserta Vaksinasi   [ANAK-ANAK]                    |");
        System.out.println("|                     2. Data Peserta Vaksinasi   [DEWASA]                       |");
        System.out.println("==================================================================================");
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
    }
    
    // IMPLEMENTASI METHOD DARI INTERFACE Data_Diri_Peserta
    @Override
    public void edit_peserta() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-        MENU UBAH DATA PESERTA VAKSINASI COVID-19       -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println("|                     1. Data Peserta Vaksinasi   [ANAK-ANAK]                    |");
        System.out.println("|                     2. Data Peserta Vaksinasi   [DEWASA]                       |");
        System.out.println("==================================================================================");
        System.out.print("                            Masukkan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.println(" ");
        switch (pilihan) {
            case 1 -> {
                if (anak.isEmpty()){
                    System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
                    System.out.println(" ");
                } else {
                    tampil_peserta_anak();
                    
                    System.out.print("Masukkan Urutan Peserta Vaksin Anak yang Ingin Diubah : ");
                    int index = Integer.parseInt(br.readLine());
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("+-+-+-+-+-+-                   DATA IDENTITAS DIRI                    -+-+-+-+-+-+");
                    System.out.println("----------------------------------------------------------------------------------");
                
                    if(index <= anak.size() || index > 0) {
                        System.out.print("Masukkan Nama Lengkap                  : ");
                        String NAMA_ANAK = br.readLine();
                        System.out.print("Masukkan Jenis Kelamin (L/P)           : ");
                        String JK_ANAK = br.readLine();
                        System.out.print("Masukkan NIK                           : ");
                        long NIK_ANAK;
                        NIK_ANAK = Long.parseLong(br.readLine());
                        System.out.print("Masukkan Tanggal Lahir                 : ");
                        String TGL_LAHIR_ANAK = br.readLine();
                        System.out.print("Masukkan Usia                          : ");
                        int USIA_ANAK = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Alamat                        : ");
                        String ALAMAT_ANAK = br.readLine();
                        System.out.print("Masukkan Nama Orang Tua                : ");
                        String ORTU_ANAK = br.readLine();
                        System.out.println("==================================================================================");
                        System.out.println(" ");
                        
                        // ENCAPSULASI (Penggunaan SETTER untuk mengisi data)
                        // memasukan data yang baru ke array list (menggantikannya)
                        anak.get(index-1).setNama(NAMA_ANAK);
                        anak.get(index-1).setJenis_kelamin(JK_ANAK);
                        anak.get(index-1).setNIK(NIK_ANAK);
                        anak.get(index-1).setTgl_lahir(TGL_LAHIR_ANAK);
                        anak.get(index-1).setUsia(USIA_ANAK);
                        anak.get(index-1).setAlamat(ALAMAT_ANAK);
                        anak.get(index-1).setNama_ortu(ORTU_ANAK);
                        
                        ///pemanggilan method terupdate

                        anak.get(index-1).ubah_data();
                        
                        System.out.println(" ");
                        System.out.println("------------------- Silahkan Lengkapi Data Riwayat Vaksinasi ! -------------------");
                        String out = centerString(82, " Saudara/i " + NAMA_ANAK.toUpperCase());
                        System.out.println(out);
                        System.out.println(" ");
                        
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("+-+-+-+-+-+-                 DATA RIWAYAT VAKSINASI                   -+-+-+-+-+-+");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.print("Masukkan Jenis Vaksin Terakhir         : ");
                        String JV_ANAK = br.readLine();
                        System.out.print("Masukkan Dosis Vaksin Terakhir (1/2/3) : ");
                        int DV_ANAK = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Tanggal Vaksin Terakhir       : ");
                        String tgl_vaksin_ANAK = br.readLine();
                        System.out.print("Masukkan Lokasi Vaksin Terakhir        : ");
                        String lokasi_vaksin_ANAK = br.readLine();
                        System.out.println("==================================================================================");
                        System.out.println(" ");

                        // ENCAPSULASI (Penggunaan SETTER untuk mengisi data)
                        // memasukan data yang baru ke array list (menggantikannya)
                        riwayat_vaksin.get(index-1).setJenis_vaksin(JV_ANAK);
                        riwayat_vaksin.get(index-1).setDosis(DV_ANAK);
                        riwayat_vaksin.get(index-1).setTgl_vaksinasi(tgl_vaksin_ANAK);
                        riwayat_vaksin.get(index-1).setLokasi_vaksinasi(lokasi_vaksin_ANAK);

                        ///pemanggilan method terupdate
                        riwayat_vaksin.get(index-1).ubah_data_anak();
                        ubah_data();
                        System.out.println(" ");
                        
                    } else {
                        System.out.println("---------------- Data Peserta Vaksinasi COVID-19 Tidak Tersedia ! --------------");
                    } 
                break;
                }
            }
                
            case 2 -> {
                if (dewasa.isEmpty()){
                    System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
                    System.out.println(" ");
                } else {
                    tampil_peserta_dewasa();

                    System.out.print("Masukkan Urutan Peserta Vaksin Dewasa yang Ingin Diubah : ");
                    int idx = Integer.parseInt(br.readLine());
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("+-+-+-+-+-+-                   DATA IDENTITAS DIRI                    -+-+-+-+-+-+");
                    System.out.println("----------------------------------------------------------------------------------");

                    if(idx <= dewasa.size() || idx > 0) {
                        System.out.print("Masukkan Nama Lengkap                  : ");
                        String NAMA_DEWASA = br.readLine();
                        System.out.print("Masukkan Jenis Kelamin (L/P)           : ");
                        String JK_DEWASA = br.readLine();
                        System.out.print("Masukkan NIK                           : ");
                        long NIK_DEWASA;
                        NIK_DEWASA = Long.parseLong(br.readLine());
                        System.out.print("Masukkan Tanggal Lahir                 : ");
                        String TGL_LAHIR_DEWASA = br.readLine();
                        System.out.print("Masukkan Usia                          : ");
                        int USIA_DEWASA = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Alamat                        : ");
                        String ALAMAT_DEWASA = br.readLine();
                        System.out.print("Masukkan No. Telp                      : ");
                        String NO_TELP = br.readLine();
                        System.out.print("Masukkan Email                         : ");
                        String EMAIL = br.readLine();
                        System.out.println("==================================================================================");
                        System.out.println(" ");
                        
                        // ENCAPSULASI (Penggunaan SETTER untuk mengisi data)
                        // memasukan data yang baru ke array list (menggantikannya)
                        dewasa.get(idx-1).setNama(NAMA_DEWASA);
                        dewasa.get(idx-1).setJenis_kelamin(JK_DEWASA);
                        dewasa.get(idx-1).setNIK(NIK_DEWASA);
                        dewasa.get(idx-1).setTgl_lahir(TGL_LAHIR_DEWASA);
                        dewasa.get(idx-1).setUsia(USIA_DEWASA);
                        dewasa.get(idx-1).setAlamat(ALAMAT_DEWASA);
                        dewasa.get(idx-1).setNo_telp(NO_TELP);
                        dewasa.get(idx-1).setEmail(EMAIL);
                        
                        ///pemanggilan method terupdate
                        dewasa.get(idx-1).ubah_data();
                        
                        System.out.println(" ");
                        System.out.println("------------------- Silahkan Lengkapi Data Riwayat Vaksinasi ! -------------------");
                        String out = centerString(82, " Saudara/i " + NAMA_DEWASA.toUpperCase());
                        System.out.println(out);
                        System.out.println(" ");

                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("+-+-+-+-+-+-                 DATA RIWAYAT VAKSINASI                   -+-+-+-+-+-+");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.print("Masukkan Jenis Vaksin Terakhir         : ");
                        String JV_DEWASA = br.readLine();
                        System.out.print("Masukkan Dosis Vaksin Terakhir (1/2/3) : ");
                        int DV_DEWASA = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Tanggal Vaksin Terakhir       : ");
                        String tgl_vaksin_DEWASA = br.readLine();
                        System.out.print("Masukkan Lokasi Vaksin Terakhir        : ");
                        String lokasi_vaksin_DEWASA = br.readLine();
                        System.out.println("==================================================================================");
                        System.out.println(" ");

                        // ENCAPSULASI (Penggunaan SETTER untuk mengisi data)
                        // memasukan data yang baru ke array list (menggantikannya)
                        riwayat_vaksin.get(idx-1).setJenis_vaksin(JV_DEWASA);
                        riwayat_vaksin.get(idx-1).setDosis(DV_DEWASA);
                        riwayat_vaksin.get(idx-1).setTgl_vaksinasi(tgl_vaksin_DEWASA);
                        riwayat_vaksin.get(idx-1).setLokasi_vaksinasi(lokasi_vaksin_DEWASA);

                        riwayat_vaksin.get(idx-1).ubah_data_dewasa();
                        ubah_data();
                        System.out.println(" ");
                    
                    } else {
                        System.out.println("---------------- Data Peserta Vaksinasi COVID-19 Tidak Tersedia ! --------------");
                    }
                    break;
                }
            }
            
            default -> {
                System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                break;
            }
        }
    }
    
    // IMPLEMENTASI METHOD DARI INTERFACE Data_Diri_Peserta
    @Override
    public void hapus_peserta() throws IOException{       
        System.out.println("==================================================================================");
        System.out.println("|+-+-+-+-+-+-        MENU HAPUS DATA PESERTA VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println("|                     1. Data Peserta Vaksinasi   [ANAK-ANAK]                    |");
        System.out.println("|                     2. Data Peserta Vaksinasi   [DEWASA]                       |");
        System.out.println("==================================================================================");
        System.out.print("                            Masukkan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("==================================================================================");
        System.out.println(" ");
        switch (pilihan) {
            case 1 -> {
                if (anak.isEmpty()){
                    System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
                    System.out.println(" ");
                } else {
                    tampil_peserta_anak();
                
                    System.out.print("Masukkan Urutan Peserta Vaksin Anak yang Ingin Dihapus : ");
                    int index = Integer.parseInt(br.readLine());
                    System.out.println("==================================================================================");
                    System.out.println(" ");
                    
                    if(index <= anak.size() || index > 0) {
                        anak.remove(index-1).hapus_data();
                        riwayat_vaksin.remove(index-1).hapus_data_anak();
                        hapus_data();
                        System.out.println(" ");
                    } else {
                        System.out.println("---------------- Data Peserta Vaksinasi COVID-19 Tidak Tersedia ! --------------");
                    }
                    break;
                }
            }
                
            case 2 -> {
                if (dewasa.isEmpty()){
                    System.out.println("--------------------- Data Peserta Vaksinasi COVID-19 Kosong ! ------------------");
                    System.out.println(" ");
                } else {
                    tampil_peserta_dewasa();
                
                    System.out.print("Masukkan Urutan Peserta Vaksin Dewasa yang Ingin Dihapus : ");
                    int idx = Integer.parseInt(br.readLine());
                    System.out.println("==================================================================================");
                    System.out.println(" ");

                    if(idx <= dewasa.size() || idx > 0) {
                        dewasa.remove(idx-1).hapus_data();
                        riwayat_vaksin.remove(idx-1).hapus_data_dewasa();
                        hapus_data();
                        System.out.println(" ");
                    } else {
                        System.out.println("---------------- Data Peserta Vaksinasi COVID-19 Tidak Tersedia ! --------------");
                    }
                    break;
                }
            }
           
            default -> {
                System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                break;
            }
        }
    }
    
    // IMPLEMENTASI METHOD DARI INTERFACE Data_Diri_Peserta
    @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-+-+-+-          MENU PETUGAS VAKSINASI            -+-+-+-+-+-+-+-+-+|");
            System.out.println("|+-+-+-+-+-+-           PENDATAAN PESERTA VAKSINASI COVID-19         -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            System.out.println("|                  1. Tambah Data Peserta Vaksinasi   [CREATE]                   |");
            System.out.println("|                  2. Tampil Data Peserta Vaksinasi   [READ]                     |");
            System.out.println("|                  3. Ubah   Data Peserta Vaksinasi   [UPDATE]                   |");
            System.out.println("|                  4. Hapus  Data Peserta Vaksinasi   [DELETE]                   |");
            System.out.println("|                  5. Kembali ke Menu Utama                                      |");
            System.out.println("==================================================================================");
            System.out.print("                            Masukkan Pilihan Anda : ");
            // EXCEPT HANDLING
            try{
                int pilihan = Integer.parseInt(br.readLine());
                System.out.println("==================================================================================");
                System.out.println(" ");
                switch (pilihan) {
                    case 1:
                        tambah_peserta();
                        break;
                    case 2:
                        tampil_peserta();
                        break;
                    case 3:
                        edit_peserta();
                        break;
                    case 4:
                        hapus_peserta();
                        break;
                    case 5:
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
