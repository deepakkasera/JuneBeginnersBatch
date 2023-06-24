package adapter;

import adapter.thirdParty.YesBankApi;

public class YesBankAPIAdapter implements BankApi {
    //Adapter Class -> Or a Wrapper class that uses YesBank to do all the banking work.
    private YesBankApi yesBankAPI = new YesBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return yesBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return yesBankAPI.sendMoney(fromAccount, toAccount, amount);
    }
}
