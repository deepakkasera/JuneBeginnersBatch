package adapter;

public class Main {
    public static void main(String[] args) {
        PhonePe pp = new PhonePe(new ICICIBankAPIAdapter());
        //pp.doSomething();
    }
}
