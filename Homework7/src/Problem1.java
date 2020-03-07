import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nonnegative number: ");
        int number = scanner.nextInt();
        if(number<0)
        {
            System.out.println("Entered number is negative");
        }
        else System.out.println(countnumbers(number));
    }

    public static int countnumbers(int anynum)
    {
        int sum = 0;
        while(anynum>0)
        {
            sum = sum+anynum%10;
            anynum/=10;
        }
        return sum;
    }
}
