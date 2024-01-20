public class App {
    public static void main(String[] args) throws Exception {
        int[] a = { 3, 1, 7, 0, 10, 11, 13, 15, 21, 23, 43, 55 };
        int N = 11, k, x, dem;
        System.out.println("Cac so nguyen trong mang la: ");
        for (k = 0; k < N; k++) {
            dem = 0;
            for (x = 2; x <= a[k]; x++)
                if (a[k] % x == 0) {
                    dem++;
                }
            if (dem == 1) {
                System.out.print(a[k] + " ");
            }
        }
    }
}
