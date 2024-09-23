public class Main {
    public static void main(String[] args) {
        double balance = 5000.0;
        double interestRate = .17;
        System.out.println("This program calculates credit card balance");
        System.out.println("Initial credit card balance is: "+balance);
        System.out.println("Monthly interest rate is "+interestRate);
        for (int count = 1; count <=2; count++) {
            balance = balance + balance * interestRate;
            System.out.print("Balance after "+count);
            System.out.println(" month(s) is "+balance);
        }
    }
}