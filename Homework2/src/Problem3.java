import java.util.Locale;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(" Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a>0 && a<1 && b>0 && b<1) System.out.println(" True ");
        else System.out.println(" False ");

        boolean c = (a>0 && a<1 && b>0 && b<1); //alternative using boolean
        System.out.println(c);
    }
}
