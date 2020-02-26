import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        int sum=0;
        int i=x;
        System.out.println("Numbers between "+x+" and "+y+ ", divisable by 9: ");
        while (i<y)
        {
            if(i%9==0)
            {   sum+=i;
                System.out.print(i+",");
                i++; }
            else {i++;}
        }
        System.out.println();
        System.out.println("Sum of these numbers: "+sum);
    }
}
