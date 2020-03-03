import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        System.out.print("Input parenthesis sequence: ");
        String seq = scanner.nextLine();
        char[] arr = seq.toCharArray();
        if (seq.length() % 2 != 0) System.out.println("Invalid");
        else if (arr[0] != '(' || arr[arr.length - 1] != ')') System.out.println("Invalid");
        else {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == '(' && arr[i + 1] == ')')
                { count1++;count2++; }
                else if (arr[i] == '(' && arr[i + 1] == '(')
                count1++;
                else if (arr[i] == ')' && arr[i + 1] == '(')
                { count1++;count2++; }
                else if (arr[i] == ')' && arr[i + 1] == ')')
                count2++;
                else break;
            }
            if (count1==count2) System.out.println("Valid");
            else System.out.println("Invalid");
        }
        }
    }
}


