import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,5,8,9,10,-27,94};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
    }
}
