package loops;
import java.util.*;
public class primenumber {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    
}
