public class Problem1 {
    public static void main(String[] args) {
        int[] a = new int []{-8, 2, 99999, 1, 55,0};
        int minimum=1;
        for(int j=0; j<a.length;j++)
        for (int i = 0; i < a.length; i++) {
            if(a[i]==minimum)
                minimum++;
        }
        System.out.println(minimum);
    }
}
