import java.util.Locale;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        if ( a + b == c) System.out.println("True");
        else System.out.println("False");

        boolean d = (a + b == c); // alternative
        System.out.println(d);
    }
}
