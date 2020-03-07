import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "";
        for(int i=0; i< a.length();i++)
        {
            if(a.charAt(i)!=',') {
                b += a.charAt(i);
            }
            else
            {
                System.out.print(reverse(b.toCharArray())+", ");
                b="";
            }
            }
        System.out.println(reverse(b.toCharArray()));
    }

  static String reverse (char[] arrayreverse)
  {
      for (int i = 0, j=arrayreverse.length-1; i < arrayreverse.length/2; i++,j--)
      {
          char temp = arrayreverse[i];
          arrayreverse[i]=arrayreverse[j];
          arrayreverse[j]=temp;
      }
      return new String(arrayreverse);
  }
}
