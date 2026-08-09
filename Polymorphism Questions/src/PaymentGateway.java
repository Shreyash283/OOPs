class Payment {

    void pay() {
        System.out.println("Cash Payment");
    }

    void pay(String upiId) {
        System.out.println("UPI Payment using " + upiId);
    }

    void pay(long cardNumber, String bankName) {
        System.out.println("Credit Card Payment");
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Bank Name : " + bankName);
    }

    void pay(String userName, String password, int otp) {
        System.out.println("Net Banking Payment");
        System.out.println("User Name : " + userName);
        System.out.println("OTP : " + otp);
    }
}

public class PaymentGateway
{

    public static void main(String[] args) {

        Payment p = new Payment();

        p.pay();
        p.pay("shreyash@upi");
        p.pay(1234567890123456L, "SBI");
        p.pay("Shreyash", "abc123", 4567);
    }
}