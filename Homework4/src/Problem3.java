import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = scanner.nextInt();
        int b = a;
        int i = 1;
        if (a == 0) {
            System.out.println("You have entered 0 value");
        }
        else {
            while (i <= 10) {
                b = a * i;
                System.out.println(a + "*" + i + "=" + b);
                i++;
            }
        }
    }
}