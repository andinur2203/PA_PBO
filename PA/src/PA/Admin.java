/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

/**
 *
 * @author ASUS
 */


import static PA.Main.menu_utama;
import static PA.Petugas_Vaksin.centerString;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// CLASS
public class Admin extends User implements Informasi_Jadwal_Lokasi{
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

    // GETTER AND SETTER
    public long getNIP() {
        return NIP;
    }

    public void setNIP(long NIP) {
        this.NIP = NIP;
    }
    
    // IMPLEMENTASI DARI ABSTRACT METHOD
    @Override
    public void tambah_data(){
        System.out.println("~~~~~~ Administrator Telah Berhasil Menambahkan Informasi Jadwal & Lokasi ! ~~~~~~");
    }
    
    @Override
    public void ubah_data(){
        System.out.println("~~~~~~~  Administrator Telah Berhasil Mengubah Informasi Jadwal & Lokasi ! ~~~~~~~");
    }
    
    @Override
    public void hapus_data(){
        System.out.println("~~~~~~ Administrator Telah Berhasil Menghapus Informasi Jadwal & Lokasi ! ~~~~~~~~");
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Jadwal_Lokasi> jadwal_lokasi = new ArrayList<>();
    
    @Override
    public void tambah_jadwal_lokasi() throws IOException{
        System.out.println("==================================================================================");       
        System.out.println("|+-+-+-+-+-+-     MENU TAMBAH JADWAL & LOKASI VAKSINASI COVID-19     -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("+-+-+-+-+-+-      INFORMASI JADWAL & LOKASI VAKSINASI COVID-19        -+-+-+-+-+-+");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Masukkan No. Pos Vaksinasi               : ");
        int no_pos = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jadwal Pelaksanaan Vaksinasi    : ");
        String jadwal = br.readLine();
        System.out.print("Masukkan Tempat Pelaksanaan Vaksinasi    : ");
        String tempat = br.readLine();
        System.out.print("Masukkan Kelurahan Pelaksanaan Vaksinasi : ");
        String kelurahan = br.readLine();
        System.out.print("Masukkan Nama Petugas Vaksin             : ");
        String nama_petugas_vaksin = br.readLine();
        System.out.println("==================================================================================");
        System.out.println(" ");

        Jadwal_Lokasi JLBaru = new Jadwal_Lokasi(no_pos, jadwal, tempat, kelurahan, nama_petugas_vaksin);             
        jadwal_lokasi.add(JLBaru);
        tambah_data();
        JLBaru.tambah_data();
    }
    
    @Override
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
            System.out.println(" ");
            for (int i = 0; i < jadwal_lokasi.size(); i++) {
                //karena index itu 0 maka ditambah 1
                // get == mengambil data dari array list
                String out = centerString(82, "Informasi Jadwal & Lokasi ke - " + (i+1));
                System.out.println(out);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("No. Pos Vaksinasi               : " + jadwal_lokasi.get(i).getNo_pos());
                System.out.println("Jadwal Pelaksanaan Vaksinasi    : " + jadwal_lokasi.get(i).getJadwal().toUpperCase());
                System.out.println("Tempat Pelaksanaan Vaksinasi    : " + jadwal_lokasi.get(i).getTempat().toUpperCase());
                System.out.println("Kelurahan Pelaksanaan Vaksinasi : " + jadwal_lokasi.get(i).getKelurahan().toUpperCase());
                System.out.println("Nama Petugas Vaksin             : " + jadwal_lokasi.get(i).getNama_petugas_vaksin().toUpperCase());
                System.out.println("==================================================================================");
                System.out.println(" ");
            }
        }
    }
    
    @Override
    public void edit_jadwal_lokasi() throws IOException{
        System.out.println("==================================================================================");       
        System.out.println("|+-+-+-+-+-+-      MENU UBAH JADWAL & LOKASI VAKSINASI COVID-19      -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println(" ");

        if (jadwal_lokasi.isEmpty()){
            System.out.println("-------------- Informasi Jadwal & Lokasi Vaksinasi COVID-19 Kosong ! -------------");
            System.out.println(" ");
        } else {
            tampil_jadwal_lokasi();
            
            System.out.print("Masukkan Urutan Informasi Jadwal & Lokasi yang Ingin Diubah : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("==================================================================================");
            
            if(index <= jadwal_lokasi.size() || index > 0) {
                System.out.print("Masukkan No. Pos Vaksinasi               : ");
                int NO_POS = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Jadwal Pelaksanaan Vaksinasi    : ");
                String JADWAL = br.readLine();
                System.out.print("Masukkan Tempat Pelaksanaan Vaksinasi    : ");
                String TEMPAT = br.readLine();
                System.out.print("Masukkan Kelurahan Pelaksanaan Vaksinasi : ");
                String KELURAHAN = br.readLine();
                System.out.print("Masukkan Nama Petugas Vaksin             : ");
                String NAMA_PETUGAS_VAKSIN = br.readLine();
                System.out.println("==================================================================================");
                System.out.println(" ");

                // ENCAPSULASI (Penggunaan SETTER untuk mengisi data)
                // memasukan data yang baru ke array list (menggantikannya)
                jadwal_lokasi.get(index-1).setNo_pos(NO_POS);
                jadwal_lokasi.get(index-1).setJadwal(JADWAL);
                jadwal_lokasi.get(index-1).setTempat(TEMPAT);
                jadwal_lokasi.get(index-1).setKelurahan(KELURAHAN);
                jadwal_lokasi.get(index-1).setNama_petugas_vaksin(NAMA_PETUGAS_VAKSIN);
                        
                ///pemanggilan method terupdate
                ubah_data();
                jadwal_lokasi.get(index-1).ubah_data();
            }
        }
    }
    
    @Override
    public void hapus_jadwal_lokasi() throws IOException{
        System.out.println("==================================================================================");        
        System.out.println("|+-+-+-+-+-+-      MENU HAPUS JADWAL & LOKASI VAKSINASI COVID-19     -+-+-+-+-+-+|");
        System.out.println("==================================================================================");
        System.out.println(" ");
        
        if (jadwal_lokasi.isEmpty()){
            System.out.println("-------------- Informasi Jadwal & Lokasi Vaksinasi COVID-19 Kosong ! -------------");
            System.out.println(" ");
        } else {
            tampil_jadwal_lokasi();
            
            System.out.print("Masukkan Urutan Informasi Jadwal & Lokasi yang Ingin Dihapus : ");
            int idx = Integer.parseInt(br.readLine());
            System.out.println("==================================================================================");
            System.out.println(" ");
            
            if(idx <= jadwal_lokasi.size() || idx > 0) {
                hapus_data();
                jadwal_lokasi.remove(idx-1).hapus_data();
            } else {
                 System.out.println("---------------- Informasi Jadwal & Lokasi Vaksinasi COVID-19 Tidak Tersedia ! --------------");
            }
        } 
    }
    
    @Override
    public void menu() throws IOException {
        while(true){
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-+-+-+-              MENU ADMINISTATOR             -+-+-+-+-+-+-+-+-+|"); 
            System.out.println("|+-+-+-+-+-+-       INFORMASI JADWAL & LOKASI VAKSINASI COVID-19     -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            System.out.println("|            1. Tambah Informasi Jadwal & Lokasi Vaksinasi   [CREATE]            |");
            System.out.println("|            2. Tampil Informasi Jadwal & Lokasi Vaksinasi   [READ]              |");
            System.out.println("|            3. Ubah   Informasi Jadwal & Lokasi Vaksinasi   [UPDATE]            |");
            System.out.println("|            4. Hapus  Informasi Jadwal & Lokasi Vaksinasi   [DELETE]            |");
            System.out.println("|            5. Kembali ke Menu Utama                                            |");
            System.out.println("==================================================================================");
            // EXCEPT HANDLING
            try{
                System.out.print("                            Masukkan Pilihan Anda : ");
                int pilihan = Integer.parseInt(br.readLine());
                System.out.println("==================================================================================");
                System.out.println(" ");
                switch (pilihan) {
                    case 1 -> {
                        tambah_jadwal_lokasi();
                        break;
                    }
                    case 2 -> {
                        tampil_jadwal_lokasi();
                        break;
                    }
                    case 3 -> {
                        edit_jadwal_lokasi();
                        break;
                    }
                    case 4 -> {
                        hapus_jadwal_lokasi();
                        break;
                    }
                    case 5 -> {
                        menu_utama();
                        break;
                    }
                    default -> {
                        System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                        System.out.println(" ");
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
    }      
}
