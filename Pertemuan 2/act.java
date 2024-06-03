public class act {
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
        System.out.println("1. " + probabilitas(1, 6));
        System.out.println("2. " + permutasi(4, 4));
        System.out.println("3. " + kombinasi(5, 3));
    }
}