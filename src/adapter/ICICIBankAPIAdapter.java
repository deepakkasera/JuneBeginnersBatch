package adapter;

import adapter.thirdParty.IciciBankApi;

public class ICICIBankAPIAdapter implements BankApi {
    private IciciBankApi iciciBankAPI = new IciciBankApi();

    @Override
    public double getBalance(String accountNumber) {
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
