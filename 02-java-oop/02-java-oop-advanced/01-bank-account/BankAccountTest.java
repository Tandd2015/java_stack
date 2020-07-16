public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount One = new BankAccount();
        BankAccount Two = new BankAccount();
        BankAccount Three = new BankAccount();
        BankAccount Four = new BankAccount();

        // One.depositMoney(100.00, "checkingsBalance d");
        // One.depositMoney(100.00, "checkingsBalance");
        // One.depositMoney(50.00, "savingsBalance");
        // System.out.println(One.getCheckingsBalance());
        // System.out.println(One.getSavingsBalance());
        // System.out.println(One.totalBanksMoney);
        // System.out.println(One.totalBanksBankAccounts);

        Two.depositMoney(100.00, "checkingsBalance d");
        Two.depositMoney(100.00, "checkingsBalance");
        Two.withdrawlMoney(20.00, "checkingsBalance");
        Two.withdrawlMoney(120.00, "checkingsBalance");
        Two.depositMoney(50.00, "savingsBalance");
        System.out.println(Two.getCheckingsBalance());
        System.out.println(Two.getSavingsBalance());
        Two.displayAccount();
        System.out.println(Two.totalBanksMoney);
        System.out.println(Two.totalBanksBankAccounts);

    }
}