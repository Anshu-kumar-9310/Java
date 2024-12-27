package Question78;

public class BankAccount {
    private final String AccountNumber;
    private String AccountHolderName;
    private int balance;

    public BankAccount(String accountNumber, String accountHolderName, int balance) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Your Bank balance is "+this.balance);
    }
    public void depositMoney(int money){
        this.balance += money;
        System.out.println("Money Deposit In Account Successfully: "+money);
    }
    public void withdrawMoney(int money){
        if (this.balance >= money) {
            this.balance -= money;
            System.out.println("Money Withdraw From Account Successfully: "+money);
        }else {
            System.out.println("Not Enough Money for withdraw.");
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("00010001","Anshu",100);
        BankAccount b2 = new BankAccount("00100010001","Sachin",5000);

        b1.withdrawMoney(500);
        b1.getBalance();
        b2.withdrawMoney(4000);
        b2.depositMoney(1000);
        b2.withdrawMoney(2500);
        b2.getBalance();
        b1.depositMoney(1500);
        b1.withdrawMoney(1000);
    }
}
