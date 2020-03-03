import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String arr = scanner.nextLine();
        while (true) {
            System.out.print("Input an index: ");
            int k = scanner.nextInt();
            char[] check = arr.toCharArray();
            if (k >= check.length||k<0) {
                System.out.println("Index is out of bounds");
                continue;
            } else {
                System.out.println("Character at index " + k + " is: " + check[k]);
                break;
            }
        }
    }
}