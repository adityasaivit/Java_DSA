package loops;
import java.util.*;
public class break_statement {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        while(true)
        {
            int n=scan.nextInt();
            if(n%10==0)
            {
                break;
            }
            else{
                System.out.println(n);
            }
        }
    }
}
