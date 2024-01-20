public class App {
    public static void main(String[] args) throws Exception {
        int[] a = { 8, 0, 0, 0, 0, 0, 13, 5, 12, 3, 0, 4, 5, 0, 6, 0, 7 };
        int N = 17, i = 0, j = 0, dem = 0;
        int[] b = new int[N];
        while (i < N) {
            if (a[i] == 0) {
                i++;
            } else {
                b[j] = a[i];
                i++;
                j++;
                dem++;
            }
        }
        for (j = 0; j < dem; j++)
            System.out.print(b[j] + " ");
    }
}
