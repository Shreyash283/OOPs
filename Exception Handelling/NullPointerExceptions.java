// NullPointerException
public class NullPointerExceptions {

    public static void main(String[] args) {

       //Without Try/Catch
        /*
        String name = null;

        System.out.println(name.length());
        */


        //With Try/Catch

        try {

            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Object reference is null.");
        }

        System.out.println("Program Ended");
    }
}