import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integer numbers to compare:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if(a==b && b==c && c==d) System.out.println("Numbers are equal!");
        else System.out.println("Numbers are not equal!");
    }
}
