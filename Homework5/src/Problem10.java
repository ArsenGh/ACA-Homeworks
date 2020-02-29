import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of the array: ");
        int n = scanner.nextInt();
        if (n < 1) System.out.println("Please enter valid value");
        else {
        int[] arr = new int[n];
        System.out.print("Input elements of array (seperated by space key): ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Input k value: ");
        int k = scanner.nextInt();
        boolean match = false;
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                if (k == count) {
                    System.out.println("Element " + arr[i] + " occurs " + k + " times");
                    match = true;
                    break;
                }

            }
            if (!match) System.out.println("no matches found");
        }
    }
}
