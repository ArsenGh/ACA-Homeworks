import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        int i=1;
        int sum=x;
        while (i<y)
        {
            sum*=x;
            i++;
        }
        System.out.println(y+"th power of "+x+" = "+sum);
    }
}
