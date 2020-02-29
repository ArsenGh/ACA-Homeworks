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
        for (int i = 0; i < arr.length - 1; i++)
        for(int j=0; j<arr.length-i-1; j++)
        {
            x = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = x;
        }
        System.out.println("Reverse of input array will look like:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
    }
    }
