public interface BankInterface {
    double checkBalnce();
    String addMoney(int amount);
    String withdrowMoney(int amout, String password);
    double calculateInterest(int years);
}

