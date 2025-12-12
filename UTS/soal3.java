class Smartphone {
    private String merk;
    private int stok;

    public Smartphone(String merk, int stok) {
        this.merk = merk;
        this.stok = stok;
    }
    public String getMerk() {
        return merk;
    }
    public int getStok() {
        return stok;
    }
    public void tambahStok(int jml) {
        if (jml > 0) {
            stok += jml;
        }
        else {
            System.out.println("Error: Jumlah > 0");
        }
    }
    public void kurangiStok(int jml) {
        if (jml == 0) {
            System.out.println("Error: Jumlah > 0");
        } else if (jml > stok) {
            System.out.println("Error: Stok kurang");
        } else {
            stok -= jml;
        }
    }
}
public class soal3 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung Galaxy S24", 10);
        s1.tambahStok(5);
        s1.kurangiStok(20);
        s1.kurangiStok(3);
        System.out.println("Stok akhir: " + s1.getStok());
    }
}