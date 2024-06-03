package act;
import act.RumusRegresi;

public class no5 {
    public static void main(String[] args){
        RumusRegresi rumus = new RumusRegresi();
        System.out.println("1. Variable bebas adalah pertumbuhan ekonomi dan variabel tak bebas adalah tingkat pengangguran");
        double[] x = {3.5, 4.0, 3.8, 4.5, 3.7};
        double[] y = {5.0, 4.8, 4.9, 4.5, 5.1};
        System.out.println("2. Nilai a = " + rumus.getA(x, y));
        System.out.println("   Nilai b = " + rumus.getB(x, y));
        System.out.println("3. Persamaan garis regresi = " + rumus.GetPersamaanGarisRegresi(x, y));
        System.out.println("4. Prediksi keuntungan = " + rumus.GetPrediksiKeuntungan(x, y, 4.2));
        System.out.println("5. Tingkat kesalahan = " + rumus.GetTingkatKesalahan(x, y));
    }
}
