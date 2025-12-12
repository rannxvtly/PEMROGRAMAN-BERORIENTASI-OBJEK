class Karyawan{
    String nama;
    int gajiPokok;
    String divisi;
    
    Karyawan(String nama, int gajiPokok, String divisi){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
    }
    public int hitungTunjangan(){
        if (divisi == "IT"){
            return (int) (gajiPokok * 0.20);
        } else if (divisi == "HRD"){
            return (int) (gajiPokok * 0.10);
        } else {
            return 0;
        }
    }
    public void cetakSlip(){
        int Tunjangan = (int) hitungTunjangan();
        int totalGaji = gajiPokok + Tunjangan;
        System.out.println("Nama: " + nama);
        System.out.println("divisi: " + divisi);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("Total Gaji: " + totalGaji);
    }
}
 public class soal2 {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Budi", 5000000, "IT");
        karyawan1.cetakSlip();
        
        Karyawan karyawan2 = new Karyawan("Siti", 4000000, "HRD");
        karyawan2.cetakSlip();
    }
 }