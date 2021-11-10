public class Main {
    public static void main(String[] args) {
        for (int i=8;i>=2;i--){
            System.out.println("Interest rate for 10000.00 at "+i+"% is : "+String.format("%.2f",calculateInterestRate(10000.00, i)));
        }
    }

    public static double calculateInterestRate(double amount, double rate){
        return (amount * (rate / 100));
    }
}
