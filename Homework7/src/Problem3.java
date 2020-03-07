public class Problem3 {
    public static void main(String[] args) {
        int a = 8;
        int[] arr = new int[] {75, 54, 8, -3, 2, 8, 67};
        int result = findindex(arr, a);
        System.out.println(result);
    }

 static int findindex (int[] anyarray, int index)
 {
     for (int i = 0; i < anyarray.length; i++)
         if(index==anyarray[i])
         {
             return i;
         }
     return -1;
 }
}
