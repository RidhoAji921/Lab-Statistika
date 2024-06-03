package act;
import java.util.Arrays;

public class RumusRegresi {
    double hitungTotalX(double[] x){
        return Arrays.stream(x).sum();
    }

    double hitungTotalY(double[] y){
        return Arrays.stream(y).sum();
    }

    double hitungTotalXY(double[] x,double[] y){
        double totalXY = 0;
        for(int i = 0; i < x.length; i++){
            totalXY += x[i] * y[i];
        }
        return totalXY;
    }

    double hitungTotalX2(double[] x){
        double totalX2 = 0;
        for(int i = 0; i < x.length; i++){
            totalX2 += x[i] * x[i];
        }
        return totalX2;
    }

    double hitungTotalY2(double[] y){
        double totalY2 = 0;
        for(int i = 0; i < y.length; i++){
            totalY2 += y[i] * y[i];
        }
        return totalY2;
    }
    
    double getB(double[] x, double[] y){
        double totalX = Arrays.stream(x).sum();
        double totalY = Arrays.stream(y).sum();
        double totalXY = hitungTotalXY(x, y);
        double totalX2 = hitungTotalX2(x);
        int n = x.length;

        double b = (n * totalXY - totalX * totalY) / (n * totalX2 - (totalX * totalX));
        return b;
    }

    double getA(double[] x, double[] y){
        double totalX = Arrays.stream(x).sum();
        double totalY = Arrays.stream(y).sum();
        int n = x.length;
        double b = getB(x, y);

        double a = (totalY / n) - b * (totalX / n);
        return a;
    }

    String GetPersamaanGarisRegresi(double[] x, double[] y){
        double a = getA(x, y);
        double b = getB(x, y);
        return "y = " + a + "+" + b + "x";
    }

    double GetPrediksiKeuntungan(double[] x, double[] y, double tambahan){
        double a = getA(x, y);
        double b = getB(x, y);
        return a+b*tambahan;
    }

    double GetTingkatKesalahan(double[] x, double[] y){
        double totalY2 = hitungTotalY2(y);
        double totalY = hitungTotalY(y);
        double totalXY = hitungTotalXY(x, y);
        double a = getA(x, y);
        double b = getB(x, y);
        int n = x.length;

        double syx = Math.sqrt((totalY2 - a * totalY - b * totalXY)/(n - 2));
        return syx;
    }
}
