package loops;
import java.util.*;
public class reverse_and_save {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int reversed=0;

        while(n>0)
        {
            reversed=reversed*10+n%10;
            n=n/10;

        }

        System.out.println(reversed);
    }
    
}
