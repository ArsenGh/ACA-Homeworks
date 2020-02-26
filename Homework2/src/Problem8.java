import java.util.Locale;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter your mark: ");
        double a = scanner.nextDouble();
        if (a<25) System.out.println(" You have F grade.");
        else if (a>=25 && a< 45) System.out.println(" You have E grade.");
        else if (a>=45 && a< 50) System.out.println(" You have D grade.");
        else if (a>=50 && a< 60) System.out.println(" You have C grade.");
        else if (a>=60 && a< 80) System.out.println(" You have B grade.");
        else System.out.println(" You have A grade.");
    }
}
