//Null Pointer Exception
public class Error3 {
    public static void showError()
    {
        try
        {
            String str = null;
            System.out.println(str.charAt(1));
        }
        catch(NullPointerException e)
        {
            System.out.println("Error-->> " + e);
            System.out.println("String is empty");
        }

        System.out.println("Code is still running");
    }
    public static void main(String args[])
    {
        showError();
    }
}