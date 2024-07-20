import java.util.*;
public class charecter_pattern {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int ch=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                ch++;

            }
            System.out.println();
        }
    }
    
}
