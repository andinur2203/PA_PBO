/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PA;


/**
 *
 * @author ASUS
 */
public abstract class Vaksin {
    // PROPERTY
    protected String jenis_vaksin;
    protected int dosis;
      
    // PENERAPAN KEYWORD FINAL PADA VARIABLE
    public final String status = "COVID-19";
    
    // CONSTRUCTOR
    public Vaksin(String status, String jenis_vaksin, int dosis){
        this.jenis_vaksin = jenis_vaksin;
        this.dosis = dosis;
    }

    public String getJenis_vaksin() {
        return jenis_vaksin;
    }

    public void setJenis_vaksin(String jenis_vaksin) {
        this.jenis_vaksin = jenis_vaksin;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getStatus() {
        return status;
    }
    
    // ABSTRACT METHOD
    public abstract void tambah_data_anak();
    public abstract void ubah_data_anak();
    public abstract void hapus_data_anak();
    
    public abstract void tambah_data_dewasa();
    public abstract void ubah_data_dewasa();
    public abstract void hapus_data_dewasa();
}
