public class ArithmaticException {

    public static void main(String[] args) {

        //Without Handdeling
        /*
        int a = 10;
        int b = 0;

        System.out.println(a / b);
        */


        //With try/Catch
        try {

            int a = 10;
            int b = 0;

            System.out.println(a / b);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program Ended");
    }
}