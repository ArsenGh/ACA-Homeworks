import java.util.Scanner;
import java.util.Locale;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(" Enter your number: ");
        double a = scanner.nextDouble();
        if (a > 0) System.out.println(" Entered number is positive.");
        else if (a == 0) System.out.println("You have entered number 0. ");
        else System.out.println(" Entered number is negative. ");
    }
}
