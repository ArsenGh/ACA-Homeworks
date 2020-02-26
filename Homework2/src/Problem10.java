import java.util.Locale;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter age of User1: ");
        double a = scanner.nextDouble();
        System.out.print("Enter age of User2: ");
        double b = scanner.nextDouble();
        System.out.print("Enter age of User3: ");
        double c = scanner.nextDouble();
        if (a>c && a>b) System.out.println("Oldest is User1.");
        else if (b>a && b>c) System.out.println("Oldest is User2.");
        else if (c>a && c>b) System.out.println("Oldest is User3.");
        else System.out.println("no one is the oldest");
        if(a<b && a<c) System.out.println("Youngest is User1");
        else if (b<a && b<c) System.out.println("Youngest is User2");
        else if (c<a && c<b) System.out.println("Youngest is User3");
        else System.out.println("no one is youngest");
    }
}
