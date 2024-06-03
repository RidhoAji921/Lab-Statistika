package act;
import act.RumusRegresi;

public class no4 {
    public static void main(String[] args){
        RumusRegresi rumus = new RumusRegresi();
        System.out.println("1. Variable bebas adalah jumlah karyawan dan variabel tak bebas adalah total penjualan");
        double[] x = {10, 15, 20, 25, 30};
        double[] y = {500, 700, 900, 1200, 1500};
        System.out.println("2. Nilai a = " + rumus.getA(x, y));
        System.out.println("   Nilai b = " + rumus.getB(x, y));
        System.out.println("3. Persamaan garis regresi = " + rumus.GetPersamaanGarisRegresi(x, y));
        System.out.println("4. Prediksi keuntungan = " + rumus.GetPrediksiKeuntungan(x, y, 18));
        System.out.println("5. Tingkat kesalahan = " + rumus.GetTingkatKesalahan(x, y));
    }
}
