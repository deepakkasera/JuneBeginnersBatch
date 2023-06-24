package adapter;

import adapter.thirdParty.HDFCBankApi;

public class HDFCBankApiAdapter implements BankApi {
    private HDFCBankApi hdfcBankApi = new HDFCBankApi();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
