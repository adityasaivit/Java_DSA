import java.util.*;

public class Incometax_calculator {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int sal=scan.nextInt();


        if(sal<=500000)
        {
            System.out.println("no tax "+0);

        }
        else if(sal>500000 && sal<=1000000)
        {
            System.out.println("20% tax "+(int)sal*0.2);

        }
        else
        {
            System.out.println("30% tax "+(int)sal*0.3);
            
        }

    }
    
}
