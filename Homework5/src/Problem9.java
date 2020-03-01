public class Problem9 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 9, 13, 51, 23, -8, 0, 71, 31, 4, 56, 8, 82, 41};
        int[] arr2 = new int[]{21, 81, -3, 5, 8, 31,41, 59, 42, 3, -80, 13, 51, 9};
        System.out.println("Searching for an element in the first array that doesn't occur in the second array");
        boolean match = false;
        for (int i = 0; i < arr1.length; i++) {
             match = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    match = true;
                    break;
                }
            }
            if (match) {
                System.out.println("found an element: " + arr1[i]);
           }
        }
        if(!match) System.out.println("No matches found");
    }
}
