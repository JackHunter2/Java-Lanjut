
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Kendaraan {
    private String plat,nama,alamat,merk,jenis,warna;
    
    public Kendaraan(String plat, String nama, String alamat, String merk, String jenis, String warna){
        this.plat = plat;
        this.nama = nama;
        this.alamat = alamat;
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
    }
    
    public String getPlat(){
        return plat;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String getWarna(){
        return warna;
    }
}
