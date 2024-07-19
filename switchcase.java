import java.util.*;

public class switchcase {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.samosa\n2.pizza\n3.burger");
        int op=scan.nextInt();
        switch(op)
        {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("pizza");
                break;
            case 3:
                System.out.println("burger");
                break;
            default:
                System.out.println("wake up to reality");
        }

    }

    
    
}
