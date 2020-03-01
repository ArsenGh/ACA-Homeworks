import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Input elements of array (seperated by space key): ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
        }
        int x;
        int j=arr.length-1;
        for (int i = 0; i < arr.length-i-1; i++)
        {
            x = arr[j];
            arr[j] = arr[i];
            arr[i] = x; j--;
        }
        System.out.println("Reverse of input array will look like:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
    }
    }
