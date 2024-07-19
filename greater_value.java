import java.util.*;
public class greater_value {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        int res=(a>b)? a:b;
        System.out.println("greater number is "+res);
    }
    
}
