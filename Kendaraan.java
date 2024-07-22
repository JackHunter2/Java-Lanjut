import java.io.*;
import java.util.ArrayList;

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
    
    public static void saveToFile(ArrayList<Kendaraan> kendaraanList,String filepath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
        for (Kendaraan kendaraan : kendaraanList){
            writer.write(kendaraan.toCSV());
            writer.newLine();
        }
        writer.close();
    }
    
    public static ArrayList<Kendaraan> loadFromFile(String filePath) throws IOException {
        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 6) {
                Kendaraan kendaraan = new Kendaraan(data[0], data[1], data[2], data[3], data[4], data[5]);
                kendaraanList.add(kendaraan);
            }
        }
        reader.close();
        return kendaraanList;
    }
    
    private String toCSV(){
        return String.join(",", plat, nama, alamat, merk, jenis, warna);
    }
}
