import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Nhap vao 1 xau ky tu: ");
            String str = input.nextLine();
            StringTokenizer strToken = new StringTokenizer(str, " ");
            System.out.println("So cac tu trong xau la: " + strToken.countTokens());
        }
    }
}
