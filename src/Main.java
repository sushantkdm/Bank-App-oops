import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name, Password, Balance to creat an account");

        //Create user
        String name= sc.nextLine();
        double balance= sc.nextDouble();
        String password= sc.nextLine();


        SBIusers user= new SBIusers(name,balance,password);
        System.out.println("Account Number is:"+user.getAccountNo());

        //Add Money
        String bal= user.addMoney(100000);
        System.out.println("Amount added sucessfully :"+bal);

        //witgodrow money
        System.out.println("Enter amount you want to withdrow");
        int money=sc.nextInt();
        System.out.println("Enter your password");
        String pass= sc.nextLine();
        System.out.println(user.withdrowMoney(money,pass));

        //calculate rate of interest
        System.out.println(user.calculateInterest(10));


    }
}
