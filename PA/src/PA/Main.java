/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PA;


/**
 *
 * @author ASUS
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // PENERAPAN KEYWORD FINAL PADA METHOD
    public static final void salam_pembuka() throws IOException{
        System.out.println("==================================================================================");
	System.out.println("||                                 SELAMAT DATANG                               ||");
	System.out.println("||                                                                              ||");
	System.out.println("||                                       DI                                     ||");
	System.out.println("||                                                                              ||");
	System.out.println("||            PROGRAM PENDAFTARAN DAN PENJADWALAN VAKSINASI COVID-19            ||");
	System.out.println("==================================================================================");
        System.out.println(" ");
    }
    
    // PENERAPAN KEYWORD FINAL PADA METHOD
    public static final void salam_penutup() throws IOException{
        System.out.println("==================================================================================");
        System.out.println("||                                 TERIMA KASIH                                 ||");
        System.out.println("||                                                                              ||");
        System.out.println("||                               TELAH MENGGUNAKAN                              ||");
        System.out.println("||                                                                              ||");
	System.out.println("||            PROGRAM PENDAFTARAN DAN PENJADWALAN VAKSINASI COVID-19            ||");
        System.out.println("==================================================================================");
    }
    
    public static void menu_utama() throws IOException {
        Petugas_Vaksin petugas_vaksin = new Petugas_Vaksin();
        Admin admin = new Admin();
        Peserta peserta = new Peserta();
        while(true){
            System.out.println("==================================================================================");
            System.out.println("|+-+-+-+-+-+-          MENU UTAMA PROGRAM VAKSINASI COVID-19         -+-+-+-+-+-+|");
            System.out.println("==================================================================================");
            System.out.println("|                        1. Masuk Sebagai Administator                           |");
            System.out.println("|                        2. Masuk Sebagai Petugas Vaksinasi                      |");
            System.out.println("|                        3. Masuk Sebagai Peserta Vaksinasi                      |");
            System.out.println("|                        0. EXIT                                                 |");
            System.out.println("==================================================================================");
            try {
                System.out.print("                            Masukkan Pilihan Anda : ");
                int pilihan = Integer.parseInt(br.readLine());
                System.out.println("==================================================================================");
                System.out.println(" ");
                switch (pilihan) {
                    case 1 -> admin.menu();
                    case 2 -> petugas_vaksin.menu();
                    case 3 -> peserta.menu();
                    case 0 -> {
                        salam_penutup();
                        System.exit(0);
                    }
                    default -> System.out.println("\n ------------------ Pilihan Menu Tidak Tersedia! Silahkan Ulangi! ----------------\n");
                }
            } catch(NumberFormatException ex){ // handle your exception
                    System.out.println("==================================================================================");
                    System.out.println("");
                    System.out.println("------------------------- Hanya Menerima Inputan Angka ! -------------------------");
                    System.out.println("");
            }
        }
    }
        
    public static void main(String[] args) throws IOException {
        salam_pembuka();
        menu_utama();   
    }
}