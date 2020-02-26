import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int i = 2;
        while (i<=n/2)
            if (n%i==0)
            {
                System.out.println(n+" is not prime number.");
                break;
            }
            else i++;
        if (n%2!=0) System.out.println(n+" is prime number.");
    }
}
