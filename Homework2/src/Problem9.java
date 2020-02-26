import java.util.Locale;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter two numbers to check sign:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x<0 && y<0 || x>0 && y>0) System.out.println("True");
        else System.out.println("False");

        boolean z = (x<0 && y<0 || x>0 && y>0); //alternative
        System.out.println(z);
    }
}
