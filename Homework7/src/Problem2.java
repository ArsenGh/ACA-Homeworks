import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double a= scanner.nextDouble();
        System.out.print("Input second number: ");
        double b= scanner.nextDouble();
        if(a==0)
        {
            System.out.println("First entered number is 0");
        }
        else if(b==0)
        {
            System.out.println("Second entered number is 0");
        }
        else {
            System.out.println(countpercent(a,b)+"%");
        }
    }
    public static double countpercent(double a, double b)
    {
        return (b-a)/a*100;
    }
}
