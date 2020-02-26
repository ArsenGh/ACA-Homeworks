import java.util.Locale;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter three numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a < b && b < c) System.out.println("Numbers are increasing");
        else if (a> b && b > c) System.out.println("Numbers are decreasing");
        else System.out.println("Neither increasing or decreasing order");
    }
}
