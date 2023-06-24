package adapter.thirdParty;

public class YesBankApi {
    public double checkBalance(String accNumber) {
        return 1000;
    }

    public boolean sendMoney(String fromAcc, String toAcc, double x) {
        return true;
    }
}
