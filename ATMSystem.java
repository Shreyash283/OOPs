class ATM {
    private int PrivatePin;
    private double Balance;

    public ATM(int PrivatePin, double Balance){
        this.PrivatePin = PrivatePin;
        this.Balance = Balance;
    }
    public int getPrivatePin(){
        return PrivatePin;
    }
    public double getBalance(){
        return Balance;
    }
    public void setPrivatePin(int PrivatePin){
        this.PrivatePin = PrivatePin;
    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
    public void changePin(int oldPin, int newPin){
        if(oldPin == PrivatePin){
            PrivatePin = newPin;
            System.out.println("\nPIN has been changed successfully.");
        } else {
            System.out.println("\nIncorrect old PIN. PIN change failed.");
        }
    }
    public void withdraw(int pin, double amount){
        if(pin == PrivatePin){
            if(amount <= Balance){
                Balance -= amount;
                System.out.println("\nWithdrawal of " + amount + " successful");

            } else {
                System.out.println("\nInsufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("\nIncorrect PIN. Withdrawal failed.");
        }
    }
    public void checkBalance(int pin){
        if(pin == PrivatePin){
            System.out.println("\nCurrent Balance: " + Balance);
        } else {
            System.out.println("\nIncorrect PIN. Cannot check balance.");
        }
    }

}
public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM(1234, 1000.0);
        atm.checkBalance(1234);
        atm.withdraw(1234, 200.0);
        atm.checkBalance(1234);
        atm.changePin(1234, 5678);
        atm.checkBalance(5678);
    }
}