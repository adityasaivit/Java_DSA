import java.util.*;

public class function_factorial {

    public static int factorial(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        return fac;
    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        System.out.println(factorial(n));

    }
    
}
