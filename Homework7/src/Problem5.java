import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a<0)
        {
            System.out.println("Entered negative number");
        }
        else
        {
            System.out.println(checkzeros(a));
        }
    }

    static boolean checkzeros (int num)
    {
        int count = 0;
        while(num>0)
        {
            if(num%10==0)
            {
                count++;
                num/=10;
            }
            else
            {
                num/=10;
            }
        }
        if(count%2==0&&count>0)
        {
            return true;
        }
        else return false;
    }
}
