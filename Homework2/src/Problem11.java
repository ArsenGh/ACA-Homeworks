import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doesSignificantWork & makesBreakthrough values: ");
        boolean doesSignificantWork = scanner.nextBoolean();
        boolean makesBreakthrough = scanner.nextBoolean();
        boolean nobelPrizeCandidate;
        if (doesSignificantWork && makesBreakthrough)    // first
            { nobelPrizeCandidate = true;
                System.out.println(nobelPrizeCandidate);}
            else {
            nobelPrizeCandidate = false; System.out.println(nobelPrizeCandidate);
        }
     boolean nobelPrizeCandidate2 = (doesSignificantWork && makesBreakthrough);  // second
        System.out.println(nobelPrizeCandidate2);

    }

}
