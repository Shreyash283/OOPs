// NumberFormatException
public class NumberFormatExceptions {
    public static void main(String[] args) {

        //Without Try/Catch
        /*
        String num = "ABC";
        int n = Integer.parseInt(num);
        System.out.println(n);
        */


        //With Try/Catch

        try {
            String num = "ABC";
            int n = Integer.parseInt(num);
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number Format.");
        }
        System.out.println("Program Ended");
    }
}