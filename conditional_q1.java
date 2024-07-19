import java.util.*;
public class conditional_q1 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if(a<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }   
}
