//Array Index out of Bound
public class Error2 {

    public static void showError()
    {
        try
        {
            int arr[]= {1,2,3,4};
            System.out.println(arr[4]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error-->> " + e);
            System.out.println("arr[4] does not exist.");
        }
        System.out.println("Code is still running");
    }
    public static void main(String args[])
    {
        showError();
    }
}
