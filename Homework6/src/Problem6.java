import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        System.out.print("Input parenthesis sequence: ");
        String seq = scanner.nextLine();
        char[] arr = seq.toCharArray();
            int count1 = 0;
            int count2 = 0;
            boolean match = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]=='(')
                {
                    count1++;
                }
                else if (arr[i]==')')
                if(count1==0||count1<=count2)
                {
                    match = false;
                    break;
                }
                else
                {
                    match = true;
                    count2++;
                }
                else {
                    break;
                }
            }
            if (count1==count2&&match) System.out.println("Valid");
            else System.out.println("Invalid");
        }
        } 
    }


