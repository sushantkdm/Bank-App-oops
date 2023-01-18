import java.util.Objects;
import java.util.UUID;

public class SBIusers implements BankInterface{

    //    Attributesss
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private  double rateOfInterest;  /*static bcoz no 1 can change frm outside of cls*/

    //Constructor
    public SBIusers(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    //Methods
    @Override
    public double checkBalnce() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Your updated balnce is : "+ balance;
    }

    @Override
    public String withdrowMoney(int amout, String enteredPassword) {
        if(Objects.equals(enteredPassword, password)){
            if(amout>balance){
                return "Insufficient Balance";
            }
            else{
                balance=balance-amout;
                return "Your updated balance is: "+balance;
            }
        }
        else{
            return "Invalid Password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
