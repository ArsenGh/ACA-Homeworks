import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input a string: ");
            String a = scanner.nextLine();
            char[] arr = a.toCharArray();
            if (arr.length < 3) System.out.println("not palindrome");
            else {
                int j = arr.length - 1;
                boolean nomatch = false;
                for (int i = 0; i < arr.length - i - 1; i++) {
                    if (arr[i] == arr[j]) j--;
                    else {
                        System.out.println("not palindrome");
                        nomatch = true;
                        break;
                    }
                }
                if (!nomatch) System.out.println("palindrome");
            }
        }
    }
}