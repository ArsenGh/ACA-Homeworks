public class Problem5 {
    public static void main(String[] args) {
        char[] arr = new char[] {'a','b','6','r','b','t','a','4','e','r','b'};
        char a = 'a';
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i])
            {
                count++;
            }
        }
        System.out.print(a+" appears in the array "+count+" time");
        if(count!=1) System.out.print("s");
    }
}
