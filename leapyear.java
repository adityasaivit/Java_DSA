import java.util.*;

public class leapyear {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }

            }
            else{
                System.out.println("Not a leap year");
            }

        }
        else{
            System.out.println("Not a leap year");
        }

    }
    
}
