import java.util.*;

public class binomial_coeff {

    public static int factorial(int n)
    {
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p*=i;
        }
        return p;
    }


    public static int coeff(int n,int r)
    {

        return factorial(n)/(factorial(r)*factorial(n-r));


    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int r=scan.nextInt();

        System.out.println(coeff(n,r));


    }
    
}
