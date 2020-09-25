//String Index Out Of Bound
public class Error5 {
    public static void showError()
    {
        try
        {
            String str = "12345";
            char ch = str.charAt(5);
            System.out.println(ch);
        }

        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Error-->> " + e);
            System.out.println("5th position of str does not exist");
        }

        System.out.println("Code is still running");
    }
    public static void main(String args[])
    {
        showError();
    }
}