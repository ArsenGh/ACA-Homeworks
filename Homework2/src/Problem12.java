import java.util.Locale;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter first number: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float b = scanner.nextFloat();
        System.out.print("Enter operator: ");
        String c = scanner.next();
        switch (c) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case "/":
                if (b == 0) System.out.println("Can't devide by zero.");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Unsupported operator.");
                break;
        }

    }
}
