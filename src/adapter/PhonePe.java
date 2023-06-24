package adapter;

public class PhonePe {
    private BankApi bankAPI;

    public PhonePe(BankApi bankAPI) {
        this.bankAPI = bankAPI;
    }

    public PhonePe(){}

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance(("accountNumber"));
        return currentBalance * 2;
    }

    public void showBalance() {
        //
    }
}
