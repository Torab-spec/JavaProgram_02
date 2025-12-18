package chapterEight.challenge78;

public class BankAccount {
    private String accNumber;
    private String accHolder;
    private double balance;


    public BankAccount(String accNumber, String accHolder) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
    }

    public void deposit(double money) {
        if (money <= 0) {
            System.out.println("Invalid deposit");
        } else {
            this.balance += money;
        }

    }

    public double withdraw(double money) {
        if (this.balance >= money) {
            this.balance -= money;
        } else if (money < 0) {
            System.out.println("Invalid withdrawal");
        } else {
            System.out.println("You have not sufficient balance");
            money = balance;
            balance = 0;
        }

        return money;

    }
}
