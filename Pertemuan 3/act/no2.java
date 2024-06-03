package act;
import act.RumusRegresi;

public class no2 {
    public static void main(String[] args){
        RumusRegresi rumus = new RumusRegresi();
        System.out.println("1. Variable bebas adalah biaya iklan dan variabel tak bebas adalah penjualan");
        double[] x = {500, 600, 700, 800, 900};
        double[] y = {2000, 2200, 2500, 2700, 3000};
        System.out.println("2. Nilai a = " + rumus.getA(x, y));
        System.out.println("   Nilai b = " + rumus.getB(x, y));
        System.out.println("3. Persamaan garis regresi = " + rumus.GetPersamaanGarisRegresi(x, y));
        System.out.println("4. Prediksi keuntungan = " + rumus.GetPrediksiKeuntungan(x, y, 1000));
        System.out.println("5. Tingkat kesalahan = " + rumus.GetTingkatKesalahan(x, y));
    }
}
