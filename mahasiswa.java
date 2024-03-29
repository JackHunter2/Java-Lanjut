class Data{
    private String Nama;
    private int NIM;
    private char Kelas;
    private String Matkul;
    private double UTS;
    private double UAS;

    public Data(String Nama, int NIM, char Kelas, String Matkul){
        this.Nama = Nama;
        this.NIM = NIM;
        this.Kelas = Kelas;
        this.Matkul = Matkul;
    }
    public void NilaiUTS(double nilai){
        if (nilai < 70) {
            System.out.println("Tidak lulus UTS karena nilai anda = " + nilai);
        }else{
        UTS = UTS + nilai;
        System.out.println("Lulus UTS dengan nilai = " + nilai);
        }
    }
    public void NilaiUAS(double nilai){
        if (nilai < 70) {
            System.out.println("Tidak lulus UAS karena nilai anda = " + nilai);
        }else{
        UAS = UAS + nilai;
        System.out.println("Lulus UAS dengan nilai = " + nilai);
        }
    }
    public void display(){
        System.out.println("Data Nilai UTS dan UAS Mahasiswa");
        System.out.println("Nama = " + Nama);
        System.out.println("NIM = " + NIM);
        System.out.println("Kelas = " + Kelas);
        System.out.println("Mata Kuliah = " + Matkul);
    }
}

class Mahasiswa{
    public static void main(String[] args) {
        Data MA1 = new Data("Abdul Rachman Ibrahim", 301230001, 'A', "Praktikum Java Lanjutan");
        MA1.display();
        MA1.NilaiUTS(80);
        MA1.NilaiUAS(80);
    }
}