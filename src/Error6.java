// Class Not Found Exception
public class Error6 {
    public static void showError()
    {
        try
        {
            Class.forName("Error7");
        }
        catch (ClassNotFoundException e)
        {

            System.out.println("Error-->> " + e);
            System.out.println("Class Error7 does not exist");
        }

        System.out.println("Code is still running");
    }
    public static void main(String args[])
    {
        showError();
    }
}