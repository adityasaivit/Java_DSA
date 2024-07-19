import java.util.*;


public class even_odd {
    public static void main(String args[])
    {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        String res=(n%2==0)? "even":"odd";
        System.out.println("the entered number is "+res);
    }
    
}
