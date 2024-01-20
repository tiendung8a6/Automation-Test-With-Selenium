public class App {
    public static void main(String[] args) throws Exception {
        int[] a = { 3, 1, 7, 0, 10, 9, 4, 14, 16, 5, 6, 2, 8, 11, 12 };
        int N = 15, k, j, temp;
        for (k = 0; k < N - 1; k++) {
            for (j = k + 1; j < N; j++) {
                if (a[k] < a[j]) {
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
        }
        for (k = 0; k < N; k++)
            System.out.print(a[k] + " ");
    }
}
