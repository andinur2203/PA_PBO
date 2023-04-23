/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;

/**
 *
 * @author ASUS
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// ABSTRACT CLASS
public abstract class User {
    // property
    protected int usia;
    protected String nama, jenis_kelamin, alamat;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public User(String nama, String jenis_kelamin, int usia, String alamat){
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;     
        this.usia = usia;
        this.alamat = alamat;
    }
    
    // OVERLOADING
    public User(){
    }
  
    // SETTER & GETTER
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    // ABSTRACT METHOD
        public abstract void tambah_data();
        public abstract void ubah_data();
        public abstract void hapus_data();
}