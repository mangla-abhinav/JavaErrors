//Number Format Exception
public class Error4 {
    public static void showError()
    {
        try
        {
            int num = Integer.parseInt ("abcd") ;
        }

        catch(NumberFormatException e)
        {
            System.out.println("Error-->> " + e);
            System.out.println("abcd is not a number");
        }

        System.out.println("Code is still running");
    }
    public static void main(String args[])
    {
        showError();
    }
}