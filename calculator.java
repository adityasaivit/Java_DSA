import java.util.*;

public class calculator {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();

        System.out.println("Enter the operator to perform:");
        char c=scan.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter a valid operator");
        }


    }
    
}
