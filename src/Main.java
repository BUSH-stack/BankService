public class Main {
    public static void main(String[] args) {
Cashback cashback = new Cashback();
Deposit deposit = new Deposit();
double resultCashback = cashback.calculateCashback(1000,3.5);
double resultDeposit = deposit.calculateDeposit(5000,5.5);
        System.out.println(resultCashback);
        System.out.println(resultDeposit);
    }
}
