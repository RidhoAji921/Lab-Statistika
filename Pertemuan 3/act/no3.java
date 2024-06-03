package act;
import act.RumusRegresi;

public class no3 {
    public static void main(String[] args){
        RumusRegresi rumus = new RumusRegresi();
        System.out.println("1. Variable bebas adalah jam belajar dan variabel tak bebas adalah nilai ujian");
        double[] x = {2, 3, 1, 4, 2.5};
        double[] y = {75, 78, 70, 85, 80};
        System.out.println("2. Nilai a = " + rumus.getA(x, y));
        System.out.println("   Nilai b = " + rumus.getB(x, y));
        System.out.println("3. Persamaan garis regresi = " + rumus.GetPersamaanGarisRegresi(x, y));
        System.out.println("4. Prediksi keuntungan = " + rumus.GetPrediksiKeuntungan(x, y, 3.5));
        System.out.println("5. Tingkat kesalahan = " + rumus.GetTingkatKesalahan(x, y));
    }
}
