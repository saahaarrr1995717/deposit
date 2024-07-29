public class LongTermDeposit extends Deposit {
    public LongTermDeposit(String depositOwnerName, double depositAmount, int duration) {
        this.setRate(20);
        this.setDepositAmount(depositAmount);
        this.setDuration(duration);
        this.setDepositOwnerName(depositOwnerName);
    }

    @Override
    void depositTotheAccount(double amount) {
        System.out.println("not supported for this type");
    }

    @Override
    void withdrawFromAccount(double amount) {
        System.out.println("not supported for this type");
    }

}
