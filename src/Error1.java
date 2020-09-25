import java.util.Scanner;
//Arithmetic Exception
public class Error1 {

    public static void doDivision(int a)
    {
        try
        {
            int num = a/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Error-->> " + e);
            System.out.println("Division by 0 is not possible");
        }
        System.out.println("Code is still running");
    }
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number-->>");
        num = sc.nextInt();
        doDivision(num);
    }
}
