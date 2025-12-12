class soal1 {
    public static void main(String[] args) {
        int StatisNilai[]= {70, 85, 90, 65, 40, 55, 95, 80};
        int lulus = 0;
        int jumlah = 0;
        
        for(int i=0; i<StatisNilai.length; i++){
            int nilai = StatisNilai[i];
            if (nilai >= 75) {
                System.out.println("nilai" + i + " = " + nilai + " Lulus");
                lulus++;
            }
            else {
                System.out.println("nilai" + i + " = " + StatisNilai[i] + " Tidak Lulus");
            }
            jumlah += nilai;
        }
        double rataRata = (double) jumlah / StatisNilai.length;
        System.out.println("Rata-rata nilai siswanya: " + rataRata);
        System.out.println("Jumlah siswa yang lulus: " + lulus);
    }   
}