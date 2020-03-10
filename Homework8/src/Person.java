public class Person {
    String name;
    double balance;
    Company company = new Company();

    double sendMoney(Person otherPerson, double amount) {
        if (balance - amount > 0) {
            otherPerson.balance += amount;
            balance -= amount;
            return otherPerson.balance;
        }
        else System.out.print("Balance not enough: ");
        return balance;
    }
}