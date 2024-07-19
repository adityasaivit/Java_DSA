package loops;
import java.util.*;
public class practice_upto_n {

    public static void main(String args[])
    {
        int n=10;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(i);
            System.out.print(' ');
        }
    }
    
}
