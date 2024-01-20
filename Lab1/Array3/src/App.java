public class App {
    public static void main(String[] args) throws Exception {
        int[] a = { 4, 5, 2, 3, 1, 7, 9, 11, 10 };
        int N = 9, k, min;
        min = a[0];
        for (k = 0; k < N; k++) {
            if (min > a[k])
                min = a[k];
        }
        System.out.println("Gia tri nho nhat cua day la: " + min);
        System.out.print("Vi tri cua so co gia tri nho nhat la: ");
        for (k = 0; k < N; k++) {
            if (min == a[k])
                System.out.print(k + " ");
        }
    }
}