import java.util.*;

public class largest_of_three {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        

        if(a>b && a>c)
        {
            System.out.println("largest "+a);
        }
        else if(b>c)
        {
            System.out.println("largest "+b);

        }
        else
        {
            System.out.println("largest "+c);

        }
    }
    
}
