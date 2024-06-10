class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private int tahunLahir;

    public Mahasiswa() {}

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public int hitungUmur(int tahunSekarang) {
        return tahunSekarang - tahunLahir;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.setNim("301230001");
        mhs.setNama("Abdul Rachman");
        mhs.setAlamat("Bandung");
        mhs.setTahunLahir(2001);

        int tahunSekarang = 2024;
        int umur = mhs.hitungUmur(tahunSekarang);

        System.out.println("NIM: " + mhs.getNim());
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Alamat: " + mhs.getAlamat());
        System.out.println("Tahun Lahir: " + mhs.getTahunLahir());
        System.out.println("Umur: " + umur + " tahun");
    }
}
