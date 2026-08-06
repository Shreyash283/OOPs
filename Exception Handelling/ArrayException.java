// ArrayIndexOutOfBoundsException
public class ArrayException {

    public static void main(String[] args) {

        //Without Try/Catch
        /*
        int arr[] = {10,20,30};

        System.out.println(arr[5]);
        */

        //With Try/Catch
        try {

            int arr[] = {10,20,30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index.");
        }
        System.out.println("Program Ended");
    }
}