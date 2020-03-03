import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first string: ");
        String a = scanner.nextLine();
        System.out.print("Input second string: ");
        String b = scanner.nextLine();
        if (a.length() != b.length())
        {
            System.out.println("Strings have different sizes");
        }
         else if(a.equals(" ")||b.equals(" "))
         {
            System.out.println("Not a valid string");
         }
         else {
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();
            char[] sum = new char[arr1.length * 2];    //add arr1 elements to sum to have 2 arr1(arr1+arr1)
            for (int i = 0, j = 0; i <= arr1.length - 1 && j <= sum.length - 1; j++) {
                sum[j] = arr1[i];
                i++;
                if (i == arr1.length) i = 0;
            }
            boolean match = false;
            int i=0;
            int j=0;
            for( i=0;i<arr2.length-1;i++)
            {
                if(arr2[j]==sum[i]&&arr2[j+1]==sum[i+1])
                {
                    j++; match=true;
                }
                else match = false;
            }
            if (match)
            {
               System.out.println("Is a rotation");
            }
            else System.out.println("Rotation not found");
        }
}
}
