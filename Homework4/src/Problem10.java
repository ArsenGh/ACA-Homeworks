import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int x=0;
        int y=1;
        int sum=0;
        int i = 3;
        while(i<=n)
        {
            sum=x+y;
            x=y;
            y=sum;
            i++;
        }
        System.out.println("fyb("+n+") = "+sum);
    }
}
