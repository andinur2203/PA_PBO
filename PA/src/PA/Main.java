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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static void loginPetugas(){
        Scanner s = new Scanner(System.in);
        String filename = "src/PA/akunPetugas.csv";
        String username, password;
        Petugas_Vaksin petugas_vaksin = new Petugas_Vaksin();
        while(true){
            try {
                Path path = Paths.get(filename);
                InputStream input = Files.newInputStream(path);
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
                    int kesempatan = 1;
                    do {
                        System.out.println("               ====================================================");
                        System.out.println("                     >>>   FORM LOGIN PETUGAS VAKSINASI   <<<      ");                 
                        System.out.println("               ====================================================");
                        System.out.print("                    Masukkan username: "); username = s.nextLine();
                        System.out.print("                    Masukkan password: "); password = s.nextLine();
                        System.out.println("               ====================================================");
                        String _temp = null;
                        String _user;
                        String _pass;
                        boolean found = false;
                        while ((_temp=reader.readLine())!=null){
                            String[]file = _temp.split(",");
                            _user = file[0];
                            _pass = file[1];
                            if(_user.equals(username)&&_pass.equals(password)){
                                found = true;
                            }
                        }
                        if (found == true){
                            System.out.println("               > ANDA BERHASIL LOGIN SEBAGAI PETUGAS VAKSINASI !  <");    
                            System.out.println(" ");
                            petugas_vaksin.menu();
                            kesempatan = 4;
                        }else{
                            System.out.println("                       >>> USERNAME ATAU PASSWORD SALAH ! <<<      ");
                            System.out.println("                ~~ HARAP MASUKKAN PASSWORD & USERNAME YANG BENAR ~~");
                            System.out.println("                       ~~ KESEMPATAN LOGIN TERSISA " + (3 - kesempatan) + " KALI ~~");
                            System.out.println(" ");
                        }
                        kesempatan ++;
                    } while (kesempatan <= 3);

                    if (kesempatan > 2){
                        System.out.println("====================== >>> KESEMPATAN LOGIN TELAH HABIS ! <<< ====================");
                        System.exit(0);
                    }
                }
                    //new UserAccount();
            }catch(IOException ex){
                System.out.print(ex.getMessage());
            }
        }
    }

    public static void loginAdmin(){
        Scanner s = new Scanner(System.in);
        String filename = "src/PA/akunAdmin.csv";
        String username, password;
        Admin admin = new Admin();
        while(true){
            try {
                Path path = Paths.get(filename);
                InputStream input = Files.newInputStream(path);
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
                    int kesempatan = 1;
                    do {
                        System.out.println("               ====================================================");
                        System.out.println("                       >>>   FORM LOGIN ADMINISTRATOR   <<<        ");                 
                        System.out.println("               ====================================================");
                        System.out.print("                    Masukkan username: "); username = s.nextLine();
                        System.out.print("                    Masukkan password: "); password = s.nextLine();
                        System.out.println("               ====================================================");
                        String _temp = null;
                        String _user;
                        String _pass;
                        boolean found = false;
                        while ((_temp=reader.readLine())!=null){
                            String[]file = _temp.split(",");
                            _user = file[0];
                            _pass = file[1];
                            if(_user.equals(username)&&_pass.equals(password)){
                                found = true;
                            }
                        }
                        if (found == true){
                            System.out.println("               > ANDA BERHASIL LOGIN SEBAGAI PETUGAS VAKSINASI !  <");    
                            System.out.println(" ");
                            admin.menu();
                            kesempatan = 4;
                        }else{
                            System.out.println("                       >>> USERNAME ATAU PASSWORD SALAH ! <<<      ");
                            System.out.println("                ~~ HARAP MASUKKAN PASSWORD & USERNAME YANG BENAR ~~");
                            System.out.println("                       ~~ KESEMPATAN LOGIN TERSISA " + (3 - kesempatan) + " KALI ~~");
                            System.out.println(" ");
                        }
                        kesempatan ++;
                    } while (kesempatan <= 3);

                    if (kesempatan > 2){
                        System.out.println("====================== >>> KESEMPATAN LOGIN TELAH HABIS ! <<< ====================");
                        System.exit(0);
                    }
                }
                    //new UserAccount();
            }catch(IOException ex){
                System.out.print(ex.getMessage());
            }
        }
    }

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
    
    // PENERAPAN KEYWORD STATIC
    public static void menu_utama() throws IOException {
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
                    case 1 -> loginAdmin();
                    case 2 -> loginPetugas();
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