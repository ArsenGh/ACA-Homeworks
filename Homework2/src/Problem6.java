import java.util.Locale;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(" Enter seconds value");
        int a = scanner.nextInt();
        int b = a/3600;
        int c = (a-b*3600)/60;
        int d = (a- b*3600 - c*60);
        System.out.println("H/M/S will be: " + b + ":" + c + ":" + d);
    }
}
