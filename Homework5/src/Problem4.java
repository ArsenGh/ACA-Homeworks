public class Problem4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"food", "breakfast", "car", "lesson6", "homework3", "wheel", "butterfly"};
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) System.out.print(",");
        }
    }
}
