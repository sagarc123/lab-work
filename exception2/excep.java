package exception2;

public class excep {

    public static void main(String[] args) {
        // TODO Auto-generated method stub\

        try 
        {
            int a=10, b=0, c;
            c=a/b;
            System.out.println("The division is: "+c);
        }
        catch (ArithmeticException e) 
        {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("You can not divide with zero");
        }
        finally
        {
            System.out.println("One should know exception for smooth execution of application");
        }
    }
}
