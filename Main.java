public class Main {
    public static void main(String[] args) {
        ShortTermDeposit shortDep1 = new ShortTermDeposit("ali", 50000, 5);
        LongTermDeposit longDep1 = new LongTermDeposit("sahar", 50000, 5);
        SavingDeposit savingDep1 = new SavingDeposit("hosein", 50000, 5);
        shortDep1.calculationInterest();
        shortDep1.depositTotheAccount(49000);
        shortDep1.withdrawFromAccount(49000);
        shortDep1.withdrawFromAccount(1000);
        longDep1.calculationInterest();
        longDep1.depositTotheAccount(49000);
        longDep1.withdrawFromAccount(5000);
        savingDep1.calculationInterest();
        savingDep1.depositTotheAccount(5000);
        savingDep1.withdrawFromAccount(60000);
        savingDep1.withdrawFromAccount(4000);

    }

}
