public abstract class Deposit {
    private String depositOwnerName;
    private double depositAmount;
    private int rate;
    private int duration;

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRate() {
        return rate;
    }

    public int setRate(int rate) {
        this.rate = rate;
        return rate;
    }


    public String getDepositOwnerName() {
        return depositOwnerName;
    }

    public void setDepositOwnerName(String depositOwnerName) {
        this.depositOwnerName = depositOwnerName;
    }

    abstract void depositTotheAccount(double amount);

    abstract void withdrawFromAccount(double amount);

    public double calculationInterest() {
        double interest = getDepositAmount() * getRate() * getDuration() / 36500;
        System.out.println("the interst of deposit : " + depositOwnerName + " for 1 mounth is : " + interest);
        return interest;
    }

}
