import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double n = scanner.nextDouble();
        double i=1;
        double sum=0;
        while (i<=n)
        {
            sum=sum+1/i;
            i++;
        }
        System.out.println(sum);
    }
}
