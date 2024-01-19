import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vui long nhap a: ");

        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();

        System.out.println("Gia tri cua a la: " + a);
        System.out.println("Vui long nhap b: ");

        Scanner sr2 = new Scanner(System.in);
        int b = sr2.nextInt();

        System.out.println("Gia tri cua b la: " + b);
        System.out.println("Tong 2 so a va b la: " + (a + b));
    }
}
