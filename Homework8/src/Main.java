public class Main {
    public static void main(String[] args) {
        Company A = new Company();
        Company B = new Company();
        Person P1 = new Person();
        Person P2 = new Person();
        Person P3 = new Person();
        Person P4 = new Person();
        Person P5 = new Person();
        Person P6 = new Person();
        P1.company = A;
        P2.company = A;
        P3.company = A;
        P4.company = B;
        P5.company = B;
        P5.company = B;
        P6.company = B;
        P1.balance = 120;
        P2.balance = 56;
        P3.balance = 10;
        P4.balance = 105;
        P5.balance = 20;
        P6.balance = 43;
        System.out.println(P1.sendMoney(P2, 20));
        System.out.println(P3.sendMoney(P1, 35));
        P4.sendMoney(P5, 30);
        Person[] arrPerson = new Person[] {P1, P2, P3, P4, P5, P6};
        Company[] arrCompany = new Company[] {A, B};
        System.out.println(mostbalance(arrPerson));
        A.totalbalance = P1.balance+P2.balance+P3.balance;
        B.totalbalance = P4.balance+P5.balance+P6.balance;
        if(A.totalbalance > B.totalbalance) {
            System.out.println("Company A's balance is higher: "+A.totalbalance);
        }
        else if (A.totalbalance < B.totalbalance)
        {
            System.out.println("Company B's balance is higher: "+B.totalbalance);
        }
        else {
            System.out.println("Balances are equal");
        }

    }
    static double mostbalance (Person[] persons)
    {
        double highest = persons[0].balance;
        for (int i = 1; i < persons.length; i++) {
            if(highest < persons[i].balance)
            {
                highest = persons[i].balance;
            }
        }
        return highest;
    }
}
