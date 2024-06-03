import java.util.Arrays;

public class pert3 {
    public static void main(String[] args) {
        //x = biaya promosi, y = keuntungan
        double[] x = {1.5, 1.0, 2.0, 2.8, 0.4, 1.3}; 
        double[] y = {3.6, 2.8, 4.3, 5.4, 1.9, 2.9};

        int n = x.length;
        
        double totalX = Arrays.stream(x).sum();
        double totalY = Arrays.stream(y).sum();
        double totalXY = 0;
        double totalX2 = 0;
        double totalY2 = 0;

        for(int i = 0; i < n; i++){
            totalXY += x[i] * y[i];
            totalX2 += x[i] * x[i];
            totalY2 += y[i] * y[i];
        }

        double b = (n * totalXY - totalX * totalY) / (n * totalX2 - (totalX * totalX));
        double a = (totalY / n) - b * (totalX / n);

        System.out.println("Langkah 2: Hitung nilai a dan b");
        System.out.println("Total X\t\t: " + totalX);
        System.out.println("Total Y\t\t: " + totalY);
        System.out.println("Total XY\t: " + totalXY);
        System.out.println("Total X^2\t: " + totalX2);
        System.out.println("Total Y^2\t: " + totalY2);
        System.out.println("Nilai a\t\t: " + a);
        System.out.println("Nilai b\t\t: " + b);

        System.out.println();
        System.out.println("Langkah 3: Persamaan garis regresi");
        System.out.println("y = " + a + "+" + b + "x");

        double xTambahan = 10;
        double yPrediksi = a+b*xTambahan;
        System.out.println();
        System.out.println("Langkah 4: Persamaan garis regresi");
        System.out.println("Hasil persamaan garis regresi\t: " + yPrediksi);
        
        System.out.println();
        System.out.println("Langkah 5: Tingkat kesalaha regresi");
        double syx = Math.sqrt((totalY2 - a * totalY - b * totalXY)/(n - 2));
        System.out.println("Hasil hitung tingkat kesalahan regresi\t: " + syx);
    }
}