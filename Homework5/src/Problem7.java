import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Input elements of array (seperated by space key): ");
        for (int i = 0; i < arr.length; i++) {

            arr[i]= scanner.nextInt();
        }
        int[] arr2 = new int[arr.length];
        for (int i = arr.length-1, j=0; i >=0&&j<arr2.length; i--,j++) {
             arr2[j] = arr[i];
            }
        System.out.println("Reverse of input array will look like:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) System.out.print(",");
        }
    }
}
