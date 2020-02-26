import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int i=1;
        int sum = 1;
        while (i<=n)
        {
            sum=i*sum; i++;
        }
        System.out.println(n+"! = "+sum);
    }
}
