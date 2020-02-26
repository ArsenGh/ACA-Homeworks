import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows and columns:");
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            if (i != 0) {
                if (i % 2 == 0) {
                    System.out.println();
                    System.out.print("black");
                } else {
                    System.out.println();
                    System.out.print("white");
                }
            }
            else System.out.print("black");
            i++;
            int j=1;
            while(j<n)
            {
                if(j%2==0&&i%2==0)
                {
                    System.out.print("-white");
                }
                else if(j%2!=0&&i%2==0)
                {
                    System.out.print("-black");
                }
                else if(j%2!=0&&i%2!=0)
                {
                    System.out.print("-white");
                }
                else System.out.print("-black");
                j++;
            }
        }
    }
}