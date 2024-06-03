import java.util.Scanner;

public class pert2 {
    public static double probabilitas(int x, int n){
        if (n == 0) return 0.0;
        return (double)x/n;
    }

    public static int faktorial(int n){
        if(n == 0) return 1;
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static int permutasi(int n, int r){
        if(r > n) return 0;
        return faktorial(n)/faktorial(n-r);
    }

    public static int kombinasi(int n, int r){
        if(r > n) return 0;
        return faktorial(n)/(faktorial(r)*faktorial(n-r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih = 0;
        while (pilih != 4) {
            System.out.println("Pilih salah satu");
            System.out.println("1. Probabilitas");
            System.out.println("2. Permutasi");
            System.out.println("3. Kombinasi");
            System.out.println("4. Keluar");
            System.out.print("Pilihan anda: ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Nilai probabilitasnya adalah: " + probabilitas(5, 8));
                    break;
                case 2:
                    System.out.println("Nilai permutasinya adalah: " + permutasi(5, 3));
                    break;
                case 3:
                    System.out.println("Nilai kombinasinya adalah: " + kombinasi(10, 4));
                    break;
                case 4:
                    System.out.println("Selamat tinggal...");
                    break;
                default:
                    break;
            }
        }
    }
}
