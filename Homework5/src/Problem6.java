import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,9,13,51,23,-8,0,71,-28,31,4,56,8,82,41};
        int max=arr[0];
        int min= arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j=arr.length-1; j>0; j--)
            {
                if(max<arr[j]) max=arr[j];
            }
            if(min>arr[i]) min=arr[i];
        }
        if(max==min)
        {
            System.out.println("Arrays elements are equal");
        }
        else {
            System.out.println("Maximum element is: " + max);
            System.out.println("Minimum element is: " + min);
        }
    }
}
