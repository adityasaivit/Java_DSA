import java.util.*;

public class functions_product {

    public static int product(int a,int b)
    {
        int product=a*b;
        return product;
    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(product(a,b));

    }
    
}
