import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,9,13,51,23,-8,0,71,31,4,56,8,82,41};
        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]<arr[j+1])
            {
                int x=arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = x;
            }
        }
        System.out.println("Maximum element is: "+arr[0]);
        System.out.println("Minimum element is: "+arr[arr.length-1]);
    }
}
