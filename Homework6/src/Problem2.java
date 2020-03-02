import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input a string: ");
            String a = scanner.nextLine();
            char[] arr = a.toCharArray();
            int count = 0;
            int lastletter = arr.length - 1;
            if (arr.length == 1 && arr[0] != ' ') System.out.println(count + 1 + " word typed");
            else if (arr.length == 1) System.out.println(count + " words typed");
            else {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] != ' ' && arr[i + 1] == ' ' && i < lastletter) {
                        count++;
                    } else if (arr[i] != ' ' && i + 1 == lastletter) count++;
                }
                System.out.println(count + " words typed");

            }
        }
    }
}
