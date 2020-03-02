import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input a string: ");
            String a = scanner.next();
            char[] arr = a.toCharArray();
            System.out.print("Input count of rotation: ");
            int n = scanner.nextInt();
            if(n<0) System.out.println("Invalid rotation value");
            else {
                for(int j=0; j<n;j++)
                for(int i=0; i<arr.length-1;i++)
                {
                    char exch =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=exch;
                }
                System.out.println(new String(arr));
            }
        }
    }
}
