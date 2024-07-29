public class ShortTermDeposit extends Deposit {
    public ShortTermDeposit(String depositOwnerName, double depositAmount, int duration) {
        this.setRate(10);
        this.setDepositAmount(depositAmount);
        this.setDuration(duration);
        this.setDepositOwnerName(depositOwnerName);
    }

    @Override
    void depositTotheAccount(double amount) {
        double newDepositAmount = getDepositAmount() + amount;
        System.out.println("new deposit amount of : " + getDepositOwnerName() + " is : " + newDepositAmount);
    }

    @Override
    void withdrawFromAccount(double amount) {
        double newDepositAmount;
        if (getDepositAmount() - amount < 2000) {
            newDepositAmount = getDepositAmount();
            System.out.println("transaction faild !!!");
        } else {
            newDepositAmount = getDepositAmount() - amount;
            System.out.println("new deposit amount of : " + getDepositOwnerName() + " is : " + newDepositAmount);
        }
    }
}
