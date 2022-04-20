


public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();



        // System.out.println("There are " + BankAccount.accountsCreated + " bank accounts created.");

        a1.depositMoney("checking", 300.00);
        System.out.println("Checking balance after deposit is: "  + a1.getCheckingBalance());

        a1.depositMoney("savings", 200.00);
        System.out.println("Savings balance after deposit is: " + a1.getSavingsBalance());

        a1.withdrawMoney("checking", 200.00);
        System.out.println("Checking balance after withdraw is: " + a1.getCheckingBalance());

        a1.getBalanceAndTotal();

        a2.depositMoney("checking", 50.00);
        System.out.println("Checking balance after deposit is: " + a2.getCheckingBalance());

        a2.depositMoney("savings", 25.00);
        System.out.println("Savings balance after deposit is: " + a2.getSavingsBalance());

        a2.withdrawMoney("savings", 20.00);
        System.out.println("Savings balance after withdraw is: " + a2.getSavingsBalance());

        a2.getBalanceAndTotal();

    }

}