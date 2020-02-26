import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int i=2;
        int sum=1;
        while(i<=n)
            if (i%2==0)
            {
                sum=sum-i;i++;
            }
            else
            {
                sum=sum+i; i++;
            }
        i=1;
        while (i<=n)
            if(i%2!=0)
            {
                System.out.print( i);
                i++;
            }
        else { System.out.print(" - "+i); if(i<n) System.out.print(" + "); i++;}
        System.out.println(" = "+sum);
    }
}
