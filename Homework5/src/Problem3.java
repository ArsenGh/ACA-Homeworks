public class Problem3 {
    public static void main(String[] args) {
        String[] arr = new String[] {"food", "breakfast", "car", "lesson6", "homework3", "wheel", "butterfly"};
        String a = "wheel";
        int i;
        for (i = 0; i < arr.length; i++) {
            if(a.equals(arr[i]))
            {
                System.out.println("String found");
                break;
            }
        }
        if(i==arr.length) System.out.println("String not found.");

    }
}
