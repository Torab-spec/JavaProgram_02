import chapterEight.challenge78.BankAccount;

public class Challenge78 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("00112233", "Torab");
        account.deposit(100);
        System.out.println(account.withdraw(200));
        account.deposit(-40);
        account.withdraw(0);


    }
}
