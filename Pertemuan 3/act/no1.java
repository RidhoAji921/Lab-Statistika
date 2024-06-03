package act;
import act.RumusRegresi;

public class no1 {
    public static void main(String[] args){
        RumusRegresi rumus = new RumusRegresi();
        System.out.println("1. Variable bebas adalah biaya promosi dan variabel tak bebas adalah keuntungan");
        double[] x = {1.2, 0.8, 1.5, 2.1, 1.0};
        double[] y = {3.0, 2.5, 3.8, 4.7, 2.8};
        System.out.println("2. Nilai a = " + rumus.getA(x, y));
        System.out.println("   Nilai b = " + rumus.getB(x, y));
        System.out.println("3. Persamaan garis regresi = " + rumus.GetPersamaanGarisRegresi(x, y));
        System.out.println("4. Prediksi keuntungan = " + rumus.GetPrediksiKeuntungan(x, y, 2.5));
        System.out.println("5. Tingkat kesalahan = " + rumus.GetTingkatKesalahan(x, y));
    }
}
