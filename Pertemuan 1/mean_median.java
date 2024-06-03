import java.util.Scanner;
class mean{
    double hitungMean(double[] TepiBawah, double[] TepiAtas, int[] Frekuensi){
        double sum_fx = 0;
        double sum_f = 0;

        for (int i = 0; i < Frekuensi.length; i++) {
            double Tb = TepiBawah[i] - 0.5;
            double Ta = TepiAtas[i] + 0.5;
            double xi = (Ta + Tb)/2;
            sum_fx += Frekuensi[i] * xi;
            sum_f += Frekuensi[i];
        }
        
        double mean = sum_fx/sum_f;
        return mean;
    }
}

class median{
    double hitungMedian(double[] TepiBawah, double[] TepiAtas, int[] Frekuensi){
        int n = 0;
        for (int f : Frekuensi){
            n += f;
        }

        double Q2 = 0.5 * n;

        int fk = 0;
        int indexKelasMedian = -1;
        for (int i = 0; i < Frekuensi.length; i++) {
            fk += Frekuensi[i];
            if (fk >= Q2) {
                indexKelasMedian = i;
                break;
            }
        }

        double Tb = TepiBawah[indexKelasMedian] - 0.5;
        fk -= Frekuensi[indexKelasMedian];
        int fi = Frekuensi[indexKelasMedian];
        double p =TepiAtas[indexKelasMedian] - TepiBawah[indexKelasMedian] + 1;

        double Me = Tb + ((Q2 - fk) / fi) * p;
        return Me;
    }
}

class modus{
    double hitungModus(double[] TepiBawah, double[] TepiAtas, int[] Frekuensi){
        int frekuensiModus = 0;
        int kelasModus = 0;
        for (int i = 0; i < Frekuensi.length; i++) {
            if (frekuensiModus < Frekuensi[i]) {
                frekuensiModus = Frekuensi[i];
                kelasModus = i;
            }
        }
        double tb = TepiBawah[kelasModus] - 0.5;
        int d1 = Frekuensi[kelasModus] - Frekuensi[kelasModus - 1];
        if(d1 < 0) d1 = -d1;
        int d2 = Frekuensi[kelasModus] - Frekuensi[kelasModus + 1];
        if(d2 < 0) d2 = -d2;
        double p = TepiAtas[kelasModus] - TepiBawah[kelasModus] + 1;
        double modus = tb + d1/((double) d1 + d2) * p;
        return modus;
    }
}

public class mean_median {
    public static void main(String[] args) {
        double[] TepiBawah  = {31, 41, 51, 61, 71, 81};
        double[] TepiAtas   = {40, 50, 60, 70, 80, 90};
        int[] Frekuensi  = {3, 5, 10, 11, 8, 3};

        Scanner scanner = new Scanner(System.in);
        mean Mean = new mean();
        median Median = new median();
        modus Modus = new modus();

        System.out.println("MENU");
        System.out.println("1. Hitung Mean");
        System.out.println("2. Hitung Median");
        System.out.println("3. Hitung Modus");
        System.out.print("Pilih: ");

        int pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Hasil Mean adalah: " + Mean.hitungMean(TepiBawah, TepiAtas, Frekuensi));
                break;
            case 2:
                System.out.println("Hasil Median adalah: " + Median.hitungMedian(TepiBawah, TepiAtas, Frekuensi));
                break;
            case 3:
                System.out.println("Hasil Modus adalah: " + Modus.hitungModus(TepiBawah, TepiAtas, Frekuensi));
                break;        
            default:
                System.out.println("Pilihan Salah!");
                break;
        }
        
    }
}
