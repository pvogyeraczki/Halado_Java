public class Fibonacci {
    public static int fib(int n) {
        int[] f = new int[n+2];

        f[0] = 0;

        f[1] = 1;

        if(n < 0) {
            return n;
        }

        for(int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    public static int recFib(int n) {
        if (n <= 1) {
            return n;
        }

        return recFib(n-1) + recFib(n-2);
    }

    public static void endless() {
        int x = 1;
        int a = 0;
        while (x == 1) {
            a += 1;
        }
    }
}
